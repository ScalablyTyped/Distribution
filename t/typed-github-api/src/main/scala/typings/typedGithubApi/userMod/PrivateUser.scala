package typings.typedGithubApi.userMod

import typings.std.Date
import typings.typedGithubApi.anon.Collaborators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedGithubApi.userMod.UserOrOrgSummary because Already inherited
- typings.typedGithubApi.userMod.UserOrOrg because Already inherited
- typings.typedGithubApi.userMod.PrivateUserOrOrg because var conflicts: avatar_url, blog, company, created_at, email, events_url, followers, following, id, location, login, name, public_gists, public_repos, repos_url, `type`, updated_at, url. Inlined total_private_repos, owned_private_repos, private_gists, disk_usage, collaborators, plan */ @js.native
trait PrivateUser extends User {
  var collaborators: Double = js.native
  var disk_usage: Double = js.native
  var owned_private_repos: Double = js.native
  var plan: Collaborators = js.native
  var private_gists: Double = js.native
  var total_private_repos: Double = js.native
  var two_factor_authentication: Boolean = js.native
}

object PrivateUser {
  @scala.inline
  def apply(
    avatar_url: String,
    bio: String,
    blog: String,
    collaborators: Double,
    company: String,
    created_at: Date,
    disk_usage: Double,
    email: String,
    events_url: String,
    followers: Double,
    followers_url: String,
    following: Double,
    following_url: String,
    gists_url: String,
    gravatar_id: String,
    hireable: Boolean,
    html_url: String,
    id: Double,
    location: String,
    login: String,
    name: String,
    organizations_url: String,
    owned_private_repos: Double,
    plan: Collaborators,
    private_gists: Double,
    public_gists: Double,
    public_repos: Double,
    received_events_url: String,
    repos_url: String,
    site_admin: Boolean,
    starred_url: String,
    subscriptions_url: String,
    total_private_repos: Double,
    two_factor_authentication: Boolean,
    `type`: typings.typedGithubApi.typedGithubApiStrings.User,
    updated_at: Date,
    url: String
  ): PrivateUser = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], bio = bio.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], disk_usage = disk_usage.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], following_url = following_url.asInstanceOf[js.Any], gists_url = gists_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], hireable = hireable.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], owned_private_repos = owned_private_repos.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], private_gists = private_gists.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], site_admin = site_admin.asInstanceOf[js.Any], starred_url = starred_url.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], total_private_repos = total_private_repos.asInstanceOf[js.Any], two_factor_authentication = two_factor_authentication.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateUser]
  }
  @scala.inline
  implicit class PrivateUserOps[Self <: PrivateUser] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTwo_factor_authentication(value: Boolean): Self = this.set("two_factor_authentication", value.asInstanceOf[js.Any])
  }
  
}

