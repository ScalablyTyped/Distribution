package typings.typedDashGithubDashApi.distApiDashInterfacesUserMod

import typings.std.Date
import typings.typedDashGithubDashApi.Anon_Collaborators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.PrivateUserOrOrg because var conflicts: avatar_url, blog, company, created_at, email, events_url, followers, following, id, location, login, name, public_gists, public_repos, repos_url, `type`, updated_at, url. Inlined total_private_repos, owned_private_repos, private_gists, disk_usage, collaborators, plan */ trait PrivateUser extends User {
  var collaborators: Double
  var disk_usage: Double
  var owned_private_repos: Double
  var plan: Anon_Collaborators
  var private_gists: Double
  var total_private_repos: Double
  var two_factor_authentication: Boolean
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
    plan: Anon_Collaborators,
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
    `type`: typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.User,
    updated_at: Date,
    url: String
  ): PrivateUser = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, bio = bio, blog = blog, collaborators = collaborators, company = company, created_at = created_at, disk_usage = disk_usage, email = email, events_url = events_url, followers = followers, followers_url = followers_url, following = following, following_url = following_url, gists_url = gists_url, gravatar_id = gravatar_id, hireable = hireable, html_url = html_url, id = id, location = location, login = login, name = name, organizations_url = organizations_url, owned_private_repos = owned_private_repos, plan = plan, private_gists = private_gists, public_gists = public_gists, public_repos = public_repos, received_events_url = received_events_url, repos_url = repos_url, site_admin = site_admin, starred_url = starred_url, subscriptions_url = subscriptions_url, total_private_repos = total_private_repos, two_factor_authentication = two_factor_authentication, updated_at = updated_at, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PrivateUser]
  }
}

