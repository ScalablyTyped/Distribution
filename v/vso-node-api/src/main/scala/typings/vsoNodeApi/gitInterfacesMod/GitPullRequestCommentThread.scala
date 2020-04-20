package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestCommentThread extends CommentThread {
  /**
    * Extended context information unique to pull requests
    */
  var pullRequestThreadContext: GitPullRequestCommentThreadContext
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
}

