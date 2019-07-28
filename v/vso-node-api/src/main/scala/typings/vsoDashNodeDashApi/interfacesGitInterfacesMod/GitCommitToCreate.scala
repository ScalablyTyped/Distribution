package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommitToCreate extends js.Object {
  var baseRef: GitRef
  var comment: String
  var pathActions: js.Array[GitPathAction]
}

object GitCommitToCreate {
  @scala.inline
  def apply(baseRef: GitRef, comment: String, pathActions: js.Array[GitPathAction]): GitCommitToCreate = {
    val __obj = js.Dynamic.literal(baseRef = baseRef, comment = comment, pathActions = pathActions)
  
    __obj.asInstanceOf[GitCommitToCreate]
  }
}

