package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
    val __obj = js.Dynamic.literal(_links = _links, comments = comments, id = id, isDeleted = isDeleted, lastUpdatedDate = lastUpdatedDate, properties = properties, publishedDate = publishedDate, pullRequestThreadContext = pullRequestThreadContext, status = status, threadContext = threadContext)
  
    __obj.asInstanceOf[GitPullRequestCommentThread]
  }
}

