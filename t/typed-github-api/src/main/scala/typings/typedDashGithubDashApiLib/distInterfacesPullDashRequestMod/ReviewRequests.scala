package typings
package typedDashGithubDashApiLib.distInterfacesPullDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewRequests extends js.Object {
  var teams: js.Array[Team]
  var users: js.Array[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary]
}

object ReviewRequests {
  @scala.inline
  def apply(
    teams: js.Array[Team],
    users: js.Array[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary]
  ): ReviewRequests = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("teams")(teams)
    __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[ReviewRequests]
  }
}

