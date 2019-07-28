package typings.typedDashGithubDashApi.distApiDashInterfacesIssueMod

import typings.std.Date
import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueComment extends js.Object {
  var body: String
  var created_at: Date
  var html_url: String
  var id: Double
  var updated_at: Date
  var url: String
  var user: UserSummary
}

object IssueComment {
  @scala.inline
  def apply(
    body: String,
    created_at: Date,
    html_url: String,
    id: Double,
    updated_at: Date,
    url: String,
    user: UserSummary
  ): IssueComment = {
    val __obj = js.Dynamic.literal(body = body, created_at = created_at, html_url = html_url, id = id, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[IssueComment]
  }
}

