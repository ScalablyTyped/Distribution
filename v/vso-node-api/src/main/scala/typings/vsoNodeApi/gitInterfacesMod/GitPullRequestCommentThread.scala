package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPullRequestCommentThread extends CommentThread {
  /**
    * Extended context information unique to pull requests
    */
  var pullRequestThreadContext: GitPullRequestCommentThreadContext = js.native
}

object GitPullRequestCommentThread {
  @scala.inline
  def apply(
    _links: js.Any,
    comments: js.Array[Comment],
    id: Double,
    isDeleted: Boolean,
    lastUpdatedDate: Date,
    properties: js.Any,
    publishedDate: Date,
    pullRequestThreadContext: GitPullRequestCommentThreadContext,
    status: CommentThreadStatus,
    threadContext: CommentThreadContext
  ): GitPullRequestCommentThread = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], pullRequestThreadContext = pullRequestThreadContext.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], threadContext = threadContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestCommentThread]
  }
  @scala.inline
  implicit class GitPullRequestCommentThreadOps[Self <: GitPullRequestCommentThread] (val x: Self) extends AnyVal {
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
    def setPullRequestThreadContext(value: GitPullRequestCommentThreadContext): Self = this.set("pullRequestThreadContext", value.asInstanceOf[js.Any])
  }
  
}

