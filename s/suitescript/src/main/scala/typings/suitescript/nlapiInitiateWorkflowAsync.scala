package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiInitiateWorkflowAsync")
@js.native
object nlapiInitiateWorkflowAsync extends js.Object {
  /**
    * Initiates a workflow on-demand and returns the workflow instance ID for the workflow-record combination.
    * @governance 20 units
    *
    * @param {string} recordtype record type ID of the workflow base record
    * @param {string, int} id internal ID of the base record
    * @param {string, int} workflowid internal ID or script ID for the workflow definition
    * @return {string}
    *
    * @since 2014.2
    * @param recordType
    * @param id
    * @param workflowId
    * @param parameters
    * @return
    */
  def apply(recordType: js.Any, id: js.Any, workflowId: js.Any, parameters: js.Any): String = js.native
}

