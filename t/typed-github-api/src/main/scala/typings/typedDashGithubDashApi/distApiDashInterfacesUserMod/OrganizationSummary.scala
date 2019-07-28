package typings.typedDashGithubDashApi.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationSummary extends UserOrOrgSummary {
  var description: String
  var hooks_url: String
  var issues_url: String
  var members_url: String
  var public_members_url: String
  @JSName("type")
  var type_OrganizationSummary: typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.Organization
}

object OrganizationSummary {
  @scala.inline
  def apply(
    avatar_url: String,
    description: String,
    events_url: String,
    hooks_url: String,
    id: Double,
    issues_url: String,
    login: String,
    members_url: String,
    public_members_url: String,
    repos_url: String,
    `type`: typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.Organization,
    url: String
  ): OrganizationSummary = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, description = description, events_url = events_url, hooks_url = hooks_url, id = id, issues_url = issues_url, login = login, members_url = members_url, public_members_url = public_members_url, repos_url = repos_url, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OrganizationSummary]
  }
}

