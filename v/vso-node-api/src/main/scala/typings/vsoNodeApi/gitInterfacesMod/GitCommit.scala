package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.ResourceRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCommit extends GitCommitRef {
  var push: GitPushRef = js.native
  var treeId: String = js.native
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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], changeCounts = changeCounts.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], remoteUrl = remoteUrl.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommit]
  }
  @scala.inline
  implicit class GitCommitOps[Self <: GitCommit] (val x: Self) extends AnyVal {
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
    def setPush(value: GitPushRef): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeId(value: String): Self = this.set("treeId", value.asInstanceOf[js.Any])
  }
  
}

