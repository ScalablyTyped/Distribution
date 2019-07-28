package typings.winrt.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentProgress extends js.Object {
  var percentage: Double
  var state: DeploymentProgressState
}

object DeploymentProgress {
  @scala.inline
  def apply(percentage: Double, state: DeploymentProgressState): DeploymentProgress = {
    val __obj = js.Dynamic.literal(percentage = percentage, state = state)
  
    __obj.asInstanceOf[DeploymentProgress]
  }
}

