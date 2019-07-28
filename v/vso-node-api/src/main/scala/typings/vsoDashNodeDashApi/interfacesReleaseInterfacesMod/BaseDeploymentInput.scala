package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseDeploymentInput extends js.Object {
  var condition: String
  /**
    * Gets or sets the job cancel timeout in minutes for deployment which are cancelled by user for this release environment
    */
  var jobCancelTimeoutInMinutes: Double
  var overrideInputs: StringDictionary[String]
  /**
    * Gets or sets the job execution timeout in minutes for deployment which are queued against this release environment
    */
  var timeoutInMinutes: Double
}

object BaseDeploymentInput {
  @scala.inline
  def apply(
    condition: String,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    timeoutInMinutes: Double
  ): BaseDeploymentInput = {
    val __obj = js.Dynamic.literal(condition = condition, jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes, overrideInputs = overrideInputs, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[BaseDeploymentInput]
  }
}

