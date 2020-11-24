package typings.typedGithubApi.userMod

import typings.std.Date
import typings.typedGithubApi.anon.Collaborators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateUserOrOrg extends UserOrOrg {
  
  var collaborators: Double = js.native
  
  var disk_usage: Double = js.native
  
  var owned_private_repos: Double = js.native
  
  var plan: Collaborators = js.native
  
  var private_gists: Double = js.native
  
  var total_private_repos: Double = js.native
}
object PrivateUserOrOrg {
  
  @scala.inline
  def apply(
    avatar_url: String,
    blog: String,
    collaborators: Double,
    company: String,
    created_at: Date,
    disk_usage: Double,
    email: String,
    events_url: String,
    followers: Double,
    following: Double,
    id: Double,
    location: String,
    login: String,
    name: String,
    owned_private_repos: Double,
    plan: Collaborators,
    private_gists: Double,
    public_gists: Double,
    public_repos: Double,
    repos_url: String,
    total_private_repos: Double,
    `type`: typings.typedGithubApi.typedGithubApiStrings.User | typings.typedGithubApi.typedGithubApiStrings.Organization,
    updated_at: Date,
    url: String
  ): PrivateUserOrOrg = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], disk_usage = disk_usage.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owned_private_repos = owned_private_repos.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], private_gists = private_gists.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], total_private_repos = total_private_repos.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateUserOrOrg]
  }
  
  @scala.inline
  implicit class PrivateUserOrOrgOps[Self <: PrivateUserOrOrg] (val x: Self) extends AnyVal {
    
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
    def setCollaborators(value: Double): Self = this.set("collaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisk_usage(value: Double): Self = this.set("disk_usage", value.asInstanceOf[js.Any])
    
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
