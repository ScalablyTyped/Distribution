package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiTriggerWorkflow")
@js.native
object nlapiTriggerWorkflow extends js.Object {
  /**
    * Triggers a workflow on a record.
    * @governance 20 units
    *
    * @param {string} recordtype record type ID of the workflow base record
    * @param {int} id internal ID of the base record
    * @param {string, int} workflowid internal ID or script ID for the workflow definition
    * @param {string, int} actionid internal ID or script ID of the action script
    * @param {string, int} stateid internal ID or script ID of the state contains the referenced add button action
    * @return {int}
    *
    * @since 2010.1
    * @param recordtype
    * @param id
    * @param workflowid
    * @param actionid
    * @param stateid
    * @return
    */
  def apply(recordtype: String, id: js.Any, workflowid: js.Any, actionid: js.Any, stateid: js.Any): js.Any = js.native
}

