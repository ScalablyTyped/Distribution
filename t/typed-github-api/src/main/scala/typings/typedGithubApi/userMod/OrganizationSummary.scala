package typings.typedGithubApi.userMod

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
  var type_OrganizationSummary: typings.typedGithubApi.typedGithubApiStrings.Organization
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
    `type`: typings.typedGithubApi.typedGithubApiStrings.Organization,
    url: String
  ): OrganizationSummary = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationSummary]
  }
}

