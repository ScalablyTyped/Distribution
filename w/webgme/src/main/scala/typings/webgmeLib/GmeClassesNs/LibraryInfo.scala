package typings
package webgmeLib.GmeClassesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraryInfo extends js.Object {
  /** the branch that your library follows in the origin project. */
  var branchName: java.lang.String
  /** the version of your library. */
  var commitHash: java.lang.String
  /** the projectId of your library. */
  var projectId: java.lang.String
}

object LibraryInfo {
  @scala.inline
  def apply(branchName: java.lang.String, commitHash: java.lang.String, projectId: java.lang.String): LibraryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("branchName")(branchName)
    __obj.updateDynamic("commitHash")(commitHash)
    __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[LibraryInfo]
  }
}

