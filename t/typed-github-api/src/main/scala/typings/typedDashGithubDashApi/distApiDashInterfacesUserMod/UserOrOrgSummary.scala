package typings.typedDashGithubDashApi.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOrOrgSummary extends js.Object {
  var avatar_url: String
  var events_url: String
  var id: Double
  var login: String
  var repos_url: String
  var `type`: typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.User | typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.Organization
  var url: String
}

object UserOrOrgSummary {
  @scala.inline
  def apply(
    avatar_url: String,
    events_url: String,
    id: Double,
    login: String,
    repos_url: String,
    `type`: typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.User | typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.Organization,
    url: String
  ): UserOrOrgSummary = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOrOrgSummary]
  }
}

