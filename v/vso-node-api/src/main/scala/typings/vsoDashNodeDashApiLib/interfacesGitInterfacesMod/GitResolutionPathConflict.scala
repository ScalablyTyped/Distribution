package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitResolutionPathConflict extends GitResolution {
  var action: GitResolutionPathConflictAction
  var renamePath: java.lang.String
}

object GitResolutionPathConflict {
  @scala.inline
  def apply(action: GitResolutionPathConflictAction, renamePath: java.lang.String): GitResolutionPathConflict = {
    val __obj = js.Dynamic.literal(action = action, renamePath = renamePath)
  
    __obj.asInstanceOf[GitResolutionPathConflict]
  }
}

