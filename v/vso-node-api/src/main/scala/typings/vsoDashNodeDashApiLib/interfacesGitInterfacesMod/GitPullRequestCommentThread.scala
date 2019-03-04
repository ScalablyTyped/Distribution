package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
    id: scala.Double,
    isDeleted: scala.Boolean,
    lastUpdatedDate: stdLib.Date,
    properties: js.Any,
    publishedDate: stdLib.Date,
    pullRequestThreadContext: GitPullRequestCommentThreadContext,
    status: CommentThreadStatus,
    threadContext: CommentThreadContext
  ): GitPullRequestCommentThread = {
    val __obj = js.Dynamic.literal(_links = _links, comments = comments, id = id, isDeleted = isDeleted, lastUpdatedDate = lastUpdatedDate, properties = properties, publishedDate = publishedDate, pullRequestThreadContext = pullRequestThreadContext, status = status, threadContext = threadContext)
  
    __obj.asInstanceOf[GitPullRequestCommentThread]
  }
}

