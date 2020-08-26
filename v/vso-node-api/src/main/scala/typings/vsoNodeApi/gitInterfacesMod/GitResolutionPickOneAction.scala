package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitResolutionPickOneAction extends GitResolution {
  var action: GitResolutionWhichAction = js.native
}

object GitResolutionPickOneAction {
  @scala.inline
  def apply(action: GitResolutionWhichAction): GitResolutionPickOneAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitResolutionPickOneAction]
  }
  @scala.inline
  implicit class GitResolutionPickOneActionOps[Self <: GitResolutionPickOneAction] (val x: Self) extends AnyVal {
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
    def setAction(value: GitResolutionWhichAction): Self = this.set("action", value.asInstanceOf[js.Any])
  }
  
}

