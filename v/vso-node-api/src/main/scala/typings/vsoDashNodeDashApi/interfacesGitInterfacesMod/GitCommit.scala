package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.ResourceRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommit extends GitCommitRef {
  var push: GitPushRef
  var treeId: String
}

object GitCommit {
  @scala.inline
  def apply(
    _links: js.Any,
    author: GitUserDate,
    changeCounts: ChangeCountDictionary,
    changes: js.Array[GitChange],
    comment: String,
    commentTruncated: Boolean,
    commitId: String,
    committer: GitUserDate,
    parents: js.Array[String],
    push: GitPushRef,
    remoteUrl: String,
    statuses: js.Array[GitStatus],
    treeId: String,
    url: String,
    workItems: js.Array[ResourceRef]
  ): GitCommit = {
    val __obj = js.Dynamic.literal(_links = _links, author = author, changeCounts = changeCounts, changes = changes, comment = comment, commentTruncated = commentTruncated, commitId = commitId, committer = committer, parents = parents, push = push, remoteUrl = remoteUrl, statuses = statuses, treeId = treeId, url = url, workItems = workItems)
  
    __obj.asInstanceOf[GitCommit]
  }
}

