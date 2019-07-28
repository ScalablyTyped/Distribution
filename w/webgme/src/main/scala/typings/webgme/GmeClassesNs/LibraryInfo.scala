package typings.webgme.GmeClassesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraryInfo extends js.Object {
  /** the branch that your library follows in the origin project. */
  var branchName: String
  /** the version of your library. */
  var commitHash: String
  /** the projectId of your library. */
  var projectId: String
}

object LibraryInfo {
  @scala.inline
  def apply(branchName: String, commitHash: String, projectId: String): LibraryInfo = {
    val __obj = js.Dynamic.literal(branchName = branchName, commitHash = commitHash, projectId = projectId)
  
    __obj.asInstanceOf[LibraryInfo]
  }
}

