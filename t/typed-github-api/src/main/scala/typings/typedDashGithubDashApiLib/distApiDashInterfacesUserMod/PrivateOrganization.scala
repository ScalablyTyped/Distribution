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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("avatar_url")(avatar_url)
    __obj.updateDynamic("billing_email")(billing_email)
    __obj.updateDynamic("blog")(blog)
    __obj.updateDynamic("collaborators")(collaborators)
    __obj.updateDynamic("company")(company)
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("default_repository_settings")(default_repository_settings)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("disk_usage")(disk_usage)
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
    __obj.updateDynamic("members_can_create_repositories")(members_can_create_repositories)
    __obj.updateDynamic("members_url")(members_url)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("owned_private_repos")(owned_private_repos)
    __obj.updateDynamic("plan")(plan)
    __obj.updateDynamic("private_gists")(private_gists)
    __obj.updateDynamic("public_gists")(public_gists)
    __obj.updateDynamic("public_members_url")(public_members_url)
    __obj.updateDynamic("public_repos")(public_repos)
    __obj.updateDynamic("repos_url")(repos_url)
    __obj.updateDynamic("total_private_repos")(total_private_repos)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PrivateOrganization]
  }
}

