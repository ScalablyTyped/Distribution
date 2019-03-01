package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommitToCreate extends js.Object {
  var baseRef: GitRef
  var comment: java.lang.String
  var pathActions: js.Array[GitPathAction]
}

object GitCommitToCreate {
  @scala.inline
  def apply(baseRef: GitRef, comment: java.lang.String, pathActions: js.Array[GitPathAction]): GitCommitToCreate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseRef")(baseRef)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("pathActions")(pathActions)
    __obj.asInstanceOf[GitCommitToCreate]
  }
}

