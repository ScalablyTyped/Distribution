package typings.typedDashGithubDashApi.distInterfacesIssueMod

import typings.moment.momentMod.Moment
import typings.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueComment extends js.Object {
  var body: String
  var createdAt: Moment
  var createdBy: UserSummary
  var htmlUri: String
  var id: Double
  var updatedAt: Moment
}

object IssueComment {
  @scala.inline
  def apply(
    body: String,
    createdAt: Moment,
    createdBy: UserSummary,
    htmlUri: String,
    id: Double,
    updatedAt: Moment
  ): IssueComment = {
    val __obj = js.Dynamic.literal(body = body, createdAt = createdAt, createdBy = createdBy, htmlUri = htmlUri, id = id, updatedAt = updatedAt)
  
    __obj.asInstanceOf[IssueComment]
  }
}

