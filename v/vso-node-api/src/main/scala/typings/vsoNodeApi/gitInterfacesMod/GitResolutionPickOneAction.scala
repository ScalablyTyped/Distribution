package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitResolutionPickOneAction extends GitResolution {
  var action: GitResolutionWhichAction
}

object GitResolutionPickOneAction {
  @scala.inline
  def apply(action: GitResolutionWhichAction): GitResolutionPickOneAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitResolutionPickOneAction]
  }
}

