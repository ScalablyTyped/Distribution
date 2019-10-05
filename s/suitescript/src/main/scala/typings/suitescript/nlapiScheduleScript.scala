package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiScheduleScript")
@js.native
object nlapiScheduleScript extends js.Object {
  /**
    * Queue a scheduled script for immediate execution and return the status QUEUED if successfull.
    * @restriction Server SuiteScript only
    * @governance 20 units
    *
    * @param {string, int}    script script ID or internal ID of scheduled script
    * @param {string, int} [deployment] script ID or internal ID of scheduled script deployment. If empty, the first "free" deployment (i.e. status = Not Scheduled or Completed) will be used
    * @param {Object}        parameters Object of parameter name->values used in this scheduled script instance
    * @return {string}    QUEUED or null if no available deployments were found or the current status of the deployment specified if it was not available.
    *
    * @since 2008.1
    * @param script
    * @param deployment
    * @param parameters
    * @return
    */
  def apply(script: String, deployment: String): String = js.native
  def apply(script: String, deployment: String, parameters: js.Any): String = js.native
}

