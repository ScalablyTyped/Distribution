package typings
package typedDashGithubDashApiLib.distApiDashInterfacesPullDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewRequests extends js.Object {
  var teams: js.Array[typedDashGithubDashApiLib.distApiDashInterfacesTeamMod.Team]
  var users: js.Array[typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary]
}

object ReviewRequests {
  @scala.inline
  def apply(
    teams: js.Array[typedDashGithubDashApiLib.distApiDashInterfacesTeamMod.Team],
    users: js.Array[typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary]
  ): ReviewRequests = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("teams")(teams)
    __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[ReviewRequests]
  }
}

