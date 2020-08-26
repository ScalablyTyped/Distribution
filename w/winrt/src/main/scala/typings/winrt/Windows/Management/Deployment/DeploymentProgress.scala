package typings.winrt.Windows.Management.Deployment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentProgress extends js.Object {
  var percentage: Double = js.native
  var state: DeploymentProgressState = js.native
}

object DeploymentProgress {
  @scala.inline
  def apply(percentage: Double, state: DeploymentProgressState): DeploymentProgress = {
    val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentProgress]
  }
  @scala.inline
  implicit class DeploymentProgressOps[Self <: DeploymentProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: DeploymentProgressState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

