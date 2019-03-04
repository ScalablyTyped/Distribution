package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludedGitCommit extends js.Object {
  var commitId: java.lang.String
  var commitTime: stdLib.Date
  var parentCommitIds: js.Array[java.lang.String]
  var repositoryId: java.lang.String
}

object IncludedGitCommit {
  @scala.inline
  def apply(
    commitId: java.lang.String,
    commitTime: stdLib.Date,
    parentCommitIds: js.Array[java.lang.String],
    repositoryId: java.lang.String
  ): IncludedGitCommit = {
    val __obj = js.Dynamic.literal(commitId = commitId, commitTime = commitTime, parentCommitIds = parentCommitIds, repositoryId = repositoryId)
  
    __obj.asInstanceOf[IncludedGitCommit]
  }
}

