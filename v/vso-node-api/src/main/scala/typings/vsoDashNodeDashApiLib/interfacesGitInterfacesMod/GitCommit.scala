package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommit extends GitCommitRef {
  var push: GitPushRef
  var treeId: java.lang.String
}

object GitCommit {
  @scala.inline
  def apply(
    _links: js.Any,
    author: GitUserDate,
    changeCounts: ChangeCountDictionary,
    changes: js.Array[GitChange],
    comment: java.lang.String,
    commentTruncated: scala.Boolean,
    commitId: java.lang.String,
    committer: GitUserDate,
    parents: js.Array[java.lang.String],
    push: GitPushRef,
    remoteUrl: java.lang.String,
    statuses: js.Array[GitStatus],
    treeId: java.lang.String,
    url: java.lang.String,
    workItems: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ResourceRef]
  ): GitCommit = {
    val __obj = js.Dynamic.literal(_links = _links, author = author, changeCounts = changeCounts, changes = changes, comment = comment, commentTruncated = commentTruncated, commitId = commitId, committer = committer, parents = parents, push = push, remoteUrl = remoteUrl, statuses = statuses, treeId = treeId, url = url, workItems = workItems)
  
    __obj.asInstanceOf[GitCommit]
  }
}

