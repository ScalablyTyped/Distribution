package typings.typedDashGithubDashApi.distApiDashInterfacesUserMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserOrOrg because var conflicts: avatar_url, events_url, id, login, repos_url, `type`, url. Inlined name, company, blog, location, email, public_repos, public_gists, followers, following, created_at, updated_at */ trait Organization extends OrganizationSummary {
  var blog: String
  var company: String
  var created_at: Date
  var email: String
  var followers: Double
  var following: Double
  var has_organization_projects: Boolean
  var has_repository_projects: Boolean
  var html_url: String
  var location: String
  var name: String
  var public_gists: Double
  var public_repos: Double
  var updated_at: Date
}

object Organization {
  @scala.inline
  def apply(
    avatar_url: String,
    blog: String,
    company: String,
    created_at: Date,
    description: String,
    email: String,
    events_url: String,
    followers: Double,
    following: Double,
    has_organization_projects: Boolean,
    has_repository_projects: Boolean,
    hooks_url: String,
    html_url: String,
    id: Double,
    issues_url: String,
    location: String,
    login: String,
    members_url: String,
    name: String,
    public_gists: Double,
    public_members_url: String,
    public_repos: Double,
    repos_url: String,
    `type`: typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.Organization,
    updated_at: Date,
    url: String
  ): Organization = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, blog = blog, company = company, created_at = created_at, description = description, email = email, events_url = events_url, followers = followers, following = following, has_organization_projects = has_organization_projects, has_repository_projects = has_repository_projects, hooks_url = hooks_url, html_url = html_url, id = id, issues_url = issues_url, location = location, login = login, members_url = members_url, name = name, public_gists = public_gists, public_members_url = public_members_url, public_repos = public_repos, repos_url = repos_url, updated_at = updated_at, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Organization]
  }
}

