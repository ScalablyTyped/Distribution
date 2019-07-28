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
    val __obj = js.Dynamic.literal(action = action, renamePath = renamePath)
  
    __obj.asInstanceOf[GitResolutionPathConflict]
  }
}

