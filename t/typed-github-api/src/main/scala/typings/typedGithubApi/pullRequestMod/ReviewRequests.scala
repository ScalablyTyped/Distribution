package typings.typedGithubApi.pullRequestMod

import typings.typedGithubApi.teamMod.Team
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewRequests extends js.Object {
  var teams: js.Array[Team] = js.native
  var users: js.Array[UserSummary] = js.native
}

object ReviewRequests {
  @scala.inline
  def apply(teams: js.Array[Team], users: js.Array[UserSummary]): ReviewRequests = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewRequests]
  }
  @scala.inline
  implicit class ReviewRequestsOps[Self <: ReviewRequests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTeamsVarargs(value: Team*): Self = this.set("teams", js.Array(value :_*))
    @scala.inline
    def setTeams(value: js.Array[Team]): Self = this.set("teams", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsersVarargs(value: UserSummary*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[UserSummary]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
  
}

