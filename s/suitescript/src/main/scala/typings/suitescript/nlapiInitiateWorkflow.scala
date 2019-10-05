package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiInitiateWorkflow")
@js.native
object nlapiInitiateWorkflow extends js.Object {
  /**
    * Initiates a workflow on-demand and returns the workflow instance ID for the workflow-record combination.
    * @governance 20 units
    *
    * @param {string} recordtype record type ID of the workflow base record
    * @param {int} id internal ID of the base record
    * @param {string, int} workflowid internal ID or script ID for the workflow definition
    * @return {int}
    *
    * @since 2010.1
    * @param recordtype
    * @param id
    * @param workflowid
    * @return
    */
  def apply(recordtype: String, id: js.Any, workflowid: js.Any): js.Any = js.native
}

