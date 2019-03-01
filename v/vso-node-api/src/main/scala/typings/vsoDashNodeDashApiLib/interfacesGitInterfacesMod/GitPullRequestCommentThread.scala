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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("comments")(comments)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isDeleted")(isDeleted)
    __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("publishedDate")(publishedDate)
    __obj.updateDynamic("pullRequestThreadContext")(pullRequestThreadContext)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("threadContext")(threadContext)
    __obj.asInstanceOf[GitPullRequestCommentThread]
  }
}

