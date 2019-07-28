package typings.typedDashGithubDashApi.distInterfacesPullDashRequestMod

import typings.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
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
    val __obj = js.Dynamic.literal(teams = teams, users = users)
  
    __obj.asInstanceOf[ReviewRequests]
  }
}

