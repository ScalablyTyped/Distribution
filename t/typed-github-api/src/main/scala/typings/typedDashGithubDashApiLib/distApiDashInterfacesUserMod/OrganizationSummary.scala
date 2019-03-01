package typings
package typedDashGithubDashApiLib.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationSummary extends UserOrOrgSummary {
  var description: java.lang.String
  var hooks_url: java.lang.String
  var issues_url: java.lang.String
  var members_url: java.lang.String
  var public_members_url: java.lang.String
  @JSName("type")
  var type_OrganizationSummary: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.Organization
}

object OrganizationSummary {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    description: java.lang.String,
    events_url: java.lang.String,
    hooks_url: java.lang.String,
    id: scala.Double,
    issues_url: java.lang.String,
    login: java.lang.String,
    members_url: java.lang.String,
    public_members_url: java.lang.String,
    repos_url: java.lang.String,
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.Organization,
    url: java.lang.String
  ): OrganizationSummary = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("avatar_url")(avatar_url)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("events_url")(events_url)
    __obj.updateDynamic("hooks_url")(hooks_url)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("issues_url")(issues_url)
    __obj.updateDynamic("login")(login)
    __obj.updateDynamic("members_url")(members_url)
    __obj.updateDynamic("public_members_url")(public_members_url)
    __obj.updateDynamic("repos_url")(repos_url)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[OrganizationSummary]
  }
}

