package typings
package typedDashGithubDashApiLib.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserOrOrg because var conflicts: avatar_url, events_url, id, login, repos_url, `type`, url. Inlined name, company, blog, location, email, public_repos, public_gists, followers, following, created_at, updated_at */ trait Organization extends OrganizationSummary {
  var blog: java.lang.String
  var company: java.lang.String
  var created_at: stdLib.Date
  var email: java.lang.String
  var followers: scala.Double
  var following: scala.Double
  var has_organization_projects: scala.Boolean
  var has_repository_projects: scala.Boolean
  var html_url: java.lang.String
  var location: java.lang.String
  var name: java.lang.String
  var public_gists: scala.Double
  var public_repos: scala.Double
  var updated_at: stdLib.Date
}

object Organization {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    blog: java.lang.String,
    company: java.lang.String,
    created_at: stdLib.Date,
    description: java.lang.String,
    email: java.lang.String,
    events_url: java.lang.String,
    followers: scala.Double,
    following: scala.Double,
    has_organization_projects: scala.Boolean,
    has_repository_projects: scala.Boolean,
    hooks_url: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    issues_url: java.lang.String,
    location: java.lang.String,
    login: java.lang.String,
    members_url: java.lang.String,
    name: java.lang.String,
    public_gists: scala.Double,
    public_members_url: java.lang.String,
    public_repos: scala.Double,
    repos_url: java.lang.String,
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.Organization,
    updated_at: stdLib.Date,
    url: java.lang.String
  ): Organization = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("avatar_url")(avatar_url)
    __obj.updateDynamic("blog")(blog)
    __obj.updateDynamic("company")(company)
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("events_url")(events_url)
    __obj.updateDynamic("followers")(followers)
    __obj.updateDynamic("following")(following)
    __obj.updateDynamic("has_organization_projects")(has_organization_projects)
    __obj.updateDynamic("has_repository_projects")(has_repository_projects)
    __obj.updateDynamic("hooks_url")(hooks_url)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("issues_url")(issues_url)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("login")(login)
    __obj.updateDynamic("members_url")(members_url)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("public_gists")(public_gists)
    __obj.updateDynamic("public_members_url")(public_members_url)
    __obj.updateDynamic("public_repos")(public_repos)
    __obj.updateDynamic("repos_url")(repos_url)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Organization]
  }
}

