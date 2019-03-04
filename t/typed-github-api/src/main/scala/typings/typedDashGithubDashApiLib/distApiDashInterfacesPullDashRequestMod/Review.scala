package typings
package typedDashGithubDashApiLib.distApiDashInterfacesPullDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Review extends js.Object {
  var body: java.lang.String
  var commit_id: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var pull_request_url: java.lang.String
  var state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.APPROVED | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.CHANGES_REQUESTED | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.COMMENTED | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.DISMISSED
  var user: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
}

object Review {
  @scala.inline
  def apply(
    body: java.lang.String,
    commit_id: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    pull_request_url: java.lang.String,
    state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.APPROVED | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.CHANGES_REQUESTED | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.COMMENTED | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.DISMISSED,
    user: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
  ): Review = {
    val __obj = js.Dynamic.literal(body = body, commit_id = commit_id, html_url = html_url, id = id, pull_request_url = pull_request_url, state = state.asInstanceOf[js.Any], user = user)
  
    __obj.asInstanceOf[Review]
  }
}

