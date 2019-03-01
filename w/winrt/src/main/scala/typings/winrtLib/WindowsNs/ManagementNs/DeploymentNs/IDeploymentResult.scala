package typings
package winrtLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeploymentResult extends js.Object {
  var activityId: java.lang.String
  var errorText: java.lang.String
  var extendedErrorCode: scala.Double
}

object IDeploymentResult {
  @scala.inline
  def apply(activityId: java.lang.String, errorText: java.lang.String, extendedErrorCode: scala.Double): IDeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activityId")(activityId)
    __obj.updateDynamic("errorText")(errorText)
    __obj.updateDynamic("extendedErrorCode")(extendedErrorCode)
    __obj.asInstanceOf[IDeploymentResult]
  }
}

