package typings.winrt.Windows.Management.Deployment

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
    val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeploymentProgress]
  }
}

