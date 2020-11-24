package typings.typedGithubApi.userMod

import typings.std.Date
import typings.typedGithubApi.anon.Collaborators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedGithubApi.userMod.UserOrOrgSummary because Already inherited
- typings.typedGithubApi.userMod.UserOrOrg because Already inherited
- typings.typedGithubApi.userMod.PrivateUserOrOrg because var conflicts: avatar_url, blog, company, created_at, email, events_url, followers, following, id, location, login, name, public_gists, public_repos, repos_url, `type`, updated_at, url. Inlined total_private_repos, owned_private_repos, private_gists, disk_usage, collaborators, plan */ @js.native
trait PrivateOrganization extends Organization {
  
  var billing_email: String = js.native
  
  var collaborators: Double = js.native
  
  var default_repository_settings: String = js.native
  
  var disk_usage: Double = js.native
  
  var members_can_create_repositories: Boolean = js.native
  
  var owned_private_repos: Double = js.native
  
  var plan: Collaborators = js.native
  
  var private_gists: Double = js.native
  
  var total_private_repos: Double = js.native
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
    plan: Collaborators,
    private_gists: Double,
    public_gists: Double,
    public_members_url: String,
    public_repos: Double,
    repos_url: String,
    total_private_repos: Double,
    `type`: typings.typedGithubApi.typedGithubApiStrings.Organization,
    updated_at: Date,
    url: String
  ): PrivateOrganization = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], billing_email = billing_email.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], default_repository_settings = default_repository_settings.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disk_usage = disk_usage.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_can_create_repositories = members_can_create_repositories.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owned_private_repos = owned_private_repos.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], private_gists = private_gists.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], total_private_repos = total_private_repos.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateOrganization]
  }
  
  @scala.inline
  implicit class PrivateOrganizationOps[Self <: PrivateOrganization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBilling_email(value: String): Self = this.set("billing_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollaborators(value: Double): Self = this.set("collaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_repository_settings(value: String): Self = this.set("default_repository_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisk_usage(value: Double): Self = this.set("disk_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_can_create_repositories(value: Boolean): Self = this.set("members_can_create_repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwned_private_repos(value: Double): Self = this.set("owned_private_repos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: Collaborators): Self = this.set("plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate_gists(value: Double): Self = this.set("private_gists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_private_repos(value: Double): Self = this.set("total_private_repos", value.asInstanceOf[js.Any])
  }
}
