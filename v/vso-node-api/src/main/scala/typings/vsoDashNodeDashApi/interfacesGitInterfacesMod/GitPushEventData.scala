package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPushEventData extends js.Object {
  var afterId: String
  var beforeId: String
  var branch: String
  var commits: js.Array[GitCommit]
  var repository: GitRepository
}

object GitPushEventData {
  @scala.inline
  def apply(
    afterId: String,
    beforeId: String,
    branch: String,
    commits: js.Array[GitCommit],
    repository: GitRepository
  ): GitPushEventData = {
    val __obj = js.Dynamic.literal(afterId = afterId, beforeId = beforeId, branch = branch, commits = commits, repository = repository)
  
    __obj.asInstanceOf[GitPushEventData]
  }
}

