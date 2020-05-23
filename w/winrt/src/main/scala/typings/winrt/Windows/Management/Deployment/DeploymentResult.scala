package typings.winrt.Windows.Management.Deployment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentResult extends IDeploymentResult

object DeploymentResult {
  @scala.inline
  def apply(activityId: String, errorText: String, extendedErrorCode: Double): DeploymentResult = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], extendedErrorCode = extendedErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentResult]
  }
}

