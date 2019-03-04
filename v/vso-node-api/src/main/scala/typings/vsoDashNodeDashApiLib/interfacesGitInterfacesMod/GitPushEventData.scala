package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPushEventData extends js.Object {
  var afterId: java.lang.String
  var beforeId: java.lang.String
  var branch: java.lang.String
  var commits: js.Array[GitCommit]
  var repository: GitRepository
}

object GitPushEventData {
  @scala.inline
  def apply(
    afterId: java.lang.String,
    beforeId: java.lang.String,
    branch: java.lang.String,
    commits: js.Array[GitCommit],
    repository: GitRepository
  ): GitPushEventData = {
    val __obj = js.Dynamic.literal(afterId = afterId, beforeId = beforeId, branch = branch, commits = commits, repository = repository)
  
    __obj.asInstanceOf[GitPushEventData]
  }
}

