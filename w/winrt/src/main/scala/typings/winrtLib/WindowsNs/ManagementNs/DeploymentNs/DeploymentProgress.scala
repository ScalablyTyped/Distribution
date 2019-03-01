package typings
package winrtLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentProgress extends js.Object {
  var percentage: scala.Double
  var state: DeploymentProgressState
}

object DeploymentProgress {
  @scala.inline
  def apply(percentage: scala.Double, state: DeploymentProgressState): DeploymentProgress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("percentage")(percentage)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[DeploymentProgress]
  }
}

