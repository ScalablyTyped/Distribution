package typings
package typedDashGithubDashApiLib.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOrOrgSummary extends js.Object {
  var avatar_url: java.lang.String
  var events_url: java.lang.String
  var id: scala.Double
  var login: java.lang.String
  var repos_url: java.lang.String
  var `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.User | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.Organization
  var url: java.lang.String
}

object UserOrOrgSummary {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    events_url: java.lang.String,
    id: scala.Double,
    login: java.lang.String,
    repos_url: java.lang.String,
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.User | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.Organization,
    url: java.lang.String
  ): UserOrOrgSummary = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, events_url = events_url, id = id, login = login, repos_url = repos_url, url = url)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOrOrgSummary]
  }
}

