package typings.winrt.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeploymentResult extends js.Object {
  var activityId: String
  var errorText: String
  var extendedErrorCode: Double
}

object IDeploymentResult {
  @scala.inline
  def apply(activityId: String, errorText: String, extendedErrorCode: Double): IDeploymentResult = {
    val __obj = js.Dynamic.literal(activityId = activityId, errorText = errorText, extendedErrorCode = extendedErrorCode)
  
    __obj.asInstanceOf[IDeploymentResult]
  }
}

