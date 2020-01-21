package typings.typedGithubApi.interfacesPullRequestMod

import typings.moment.mod.Moment
import typings.typedGithubApi.interfacesIssueMod.IssueComment
import typings.typedGithubApi.interfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewComment extends IssueComment {
  var diffHunk: String
  var position: Double
}

object ReviewComment {
  @scala.inline
  def apply(
    body: String,
    createdAt: Moment,
    createdBy: UserSummary,
    diffHunk: String,
    htmlUri: String,
    id: Double,
    position: Double,
    updatedAt: Moment
  ): ReviewComment = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], diffHunk = diffHunk.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReviewComment]
  }
}

