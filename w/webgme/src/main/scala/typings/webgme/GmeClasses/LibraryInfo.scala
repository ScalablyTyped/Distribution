package typings.webgme.GmeClasses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LibraryInfo extends js.Object {
  /** the branch that your library follows in the origin project. */
  var branchName: String = js.native
  /** the version of your library. */
  var commitHash: String = js.native
  /** the projectId of your library. */
  var projectId: String = js.native
}

object LibraryInfo {
  @scala.inline
  def apply(branchName: String, commitHash: String, projectId: String): LibraryInfo = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], commitHash = commitHash.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibraryInfo]
  }
  @scala.inline
  implicit class LibraryInfoOps[Self <: LibraryInfo] (val x: Self) extends AnyVal {
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
    def setBranchName(value: String): Self = this.set("branchName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitHash(value: String): Self = this.set("commitHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
  }
  
}

