package typings.typedGithubApi.pullRequestMod

import typings.typedGithubApi.teamMod.Team
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewRequests extends js.Object {
  var teams: js.Array[Team]
  var users: js.Array[UserSummary]
}

object ReviewRequests {
  @scala.inline
  def apply(teams: js.Array[Team], users: js.Array[UserSummary]): ReviewRequests = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReviewRequests]
  }
}

