package typings.typedDashGithubDashApi.distInterfacesPullDashRequestMod

import typings.moment.momentMod.Moment
import typings.typedDashGithubDashApi.distInterfacesIssueMod.IssueComment
import typings.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
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
    val __obj = js.Dynamic.literal(body = body, createdAt = createdAt, createdBy = createdBy, diffHunk = diffHunk, htmlUri = htmlUri, id = id, position = position, updatedAt = updatedAt)
  
    __obj.asInstanceOf[ReviewComment]
  }
}

