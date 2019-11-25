package typings.typedDashGithubDashApi.distApiDashInterfacesPullDashRequestMod

import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.APPROVED
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.CHANGES_REQUESTED
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.COMMENTED
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.DISMISSED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Review extends js.Object {
  var body: String
  var commit_id: String
  var html_url: String
  var id: Double
  var pull_request_url: String
  var state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED
  var user: UserSummary
}

object Review {
  @scala.inline
  def apply(
    body: String,
    commit_id: String,
    html_url: String,
    id: Double,
    pull_request_url: String,
    state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED,
    user: UserSummary
  ): Review = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Review]
  }
}

