package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitResolutionPathConflict extends GitResolution {
  var action: GitResolutionPathConflictAction
  var renamePath: String
}

object GitResolutionPathConflict {
  @scala.inline
  def apply(action: GitResolutionPathConflictAction, renamePath: String): GitResolutionPathConflict = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], renamePath = renamePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitResolutionPathConflict]
  }
}

