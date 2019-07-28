package typings.typedDashGithubDashApi.distApiDashInterfacesUserMod

import typings.std.Date
import typings.typedDashGithubDashApi.Anon_Collaborators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.PrivateUserOrOrg because var conflicts: avatar_url, blog, company, created_at, email, events_url, followers, following, id, location, login, name, public_gists, public_repos, repos_url, `type`, updated_at, url. Inlined total_private_repos, owned_private_repos, private_gists, disk_usage, collaborators, plan */ trait PrivateOrganization extends Organization {
  var billing_email: String
  var collaborators: Double
  var default_repository_settings: String
  var disk_usage: Double
  var members_can_create_repositories: Boolean
  var owned_private_repos: Double
  var plan: Anon_Collaborators
  var private_gists: Double
  var total_private_repos: Double
}

object PrivateOrganization {
  @scala.inline
  def apply(
    avatar_url: String,
    billing_email: String,
    blog: String,
    collaborators: Double,
    company: String,
    created_at: Date,
    default_repository_settings: String,
    description: String,
    disk_usage: Double,
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
    members_can_create_repositories: Boolean,
    members_url: String,
    name: String,
    owned_private_repos: Double,
    plan: Anon_Collaborators,
    private_gists: Double,
    public_gists: Double,
    public_members_url: String,
    public_repos: Double,
    repos_url: String,
    total_private_repos: Double,
    `type`: typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.Organization,
    updated_at: Date,
    url: String
  ): PrivateOrganization = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, billing_email = billing_email, blog = blog, collaborators = collaborators, company = company, created_at = created_at, default_repository_settings = default_repository_settings, description = description, disk_usage = disk_usage, email = email, events_url = events_url, followers = followers, following = following, has_organization_projects = has_organization_projects, has_repository_projects = has_repository_projects, hooks_url = hooks_url, html_url = html_url, id = id, issues_url = issues_url, location = location, login = login, members_can_create_repositories = members_can_create_repositories, members_url = members_url, name = name, owned_private_repos = owned_private_repos, plan = plan, private_gists = private_gists, public_gists = public_gists, public_members_url = public_members_url, public_repos = public_repos, repos_url = repos_url, total_private_repos = total_private_repos, updated_at = updated_at, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PrivateOrganization]
  }
}

