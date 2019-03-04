package typings
package typedDashGithubDashApiLib.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typedDashGithubDashApiLib.distApiDashInterfacesUserMod.PrivateUserOrOrg because var conflicts: avatar_url, blog, company, created_at, email, events_url, followers, following, id, location, login, name, public_gists, public_repos, repos_url, `type`, updated_at, url. Inlined total_private_repos, owned_private_repos, private_gists, disk_usage, collaborators, plan */ trait PrivateOrganization extends Organization {
  var billing_email: java.lang.String
  var collaborators: scala.Double
  var default_repository_settings: java.lang.String
  var disk_usage: scala.Double
  var members_can_create_repositories: scala.Boolean
  var owned_private_repos: scala.Double
  var plan: typedDashGithubDashApiLib.Anon_Collaborators
  var private_gists: scala.Double
  var total_private_repos: scala.Double
}

object PrivateOrganization {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    billing_email: java.lang.String,
    blog: java.lang.String,
    collaborators: scala.Double,
    company: java.lang.String,
    created_at: stdLib.Date,
    default_repository_settings: java.lang.String,
    description: java.lang.String,
    disk_usage: scala.Double,
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
    members_can_create_repositories: scala.Boolean,
    members_url: java.lang.String,
    name: java.lang.String,
    owned_private_repos: scala.Double,
    plan: typedDashGithubDashApiLib.Anon_Collaborators,
    private_gists: scala.Double,
    public_gists: scala.Double,
    public_members_url: java.lang.String,
    public_repos: scala.Double,
    repos_url: java.lang.String,
    total_private_repos: scala.Double,
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.Organization,
    updated_at: stdLib.Date,
    url: java.lang.String
  ): PrivateOrganization = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, billing_email = billing_email, blog = blog, collaborators = collaborators, company = company, created_at = created_at, default_repository_settings = default_repository_settings, description = description, disk_usage = disk_usage, email = email, events_url = events_url, followers = followers, following = following, has_organization_projects = has_organization_projects, has_repository_projects = has_repository_projects, hooks_url = hooks_url, html_url = html_url, id = id, issues_url = issues_url, location = location, login = login, members_can_create_repositories = members_can_create_repositories, members_url = members_url, name = name, owned_private_repos = owned_private_repos, plan = plan, private_gists = private_gists, public_gists = public_gists, public_members_url = public_members_url, public_repos = public_repos, repos_url = repos_url, total_private_repos = total_private_repos, updated_at = updated_at, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PrivateOrganization]
  }
}

