package typings.typedDashGithubDashApi.distApiDashInterfacesUserMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserOrOrgSummary because Already inherited
- typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserOrOrg because var conflicts: avatar_url, events_url, id, login, repos_url, `type`, url. Inlined name, company, blog, location, email, public_repos, public_gists, followers, following, created_at, updated_at */ trait User extends UserSummary {
  var bio: String
  var blog: String
  var company: String
  var created_at: Date
  var email: String
  var followers: Double
  var following: Double
  var hireable: Boolean
  var location: String
  var name: String
  var public_gists: Double
  var public_repos: Double
  var updated_at: Date
}

object User {
  @scala.inline
  def apply(
    avatar_url: String,
    bio: String,
    blog: String,
    company: String,
    created_at: Date,
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
    public_gists: Double,
    public_repos: Double,
    received_events_url: String,
    repos_url: String,
    site_admin: Boolean,
    starred_url: String,
    subscriptions_url: String,
    `type`: typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.User,
    updated_at: Date,
    url: String
  ): User = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, bio = bio, blog = blog, company = company, created_at = created_at, email = email, events_url = events_url, followers = followers, followers_url = followers_url, following = following, following_url = following_url, gists_url = gists_url, gravatar_id = gravatar_id, hireable = hireable, html_url = html_url, id = id, location = location, login = login, name = name, organizations_url = organizations_url, public_gists = public_gists, public_repos = public_repos, received_events_url = received_events_url, repos_url = repos_url, site_admin = site_admin, starred_url = starred_url, subscriptions_url = subscriptions_url, updated_at = updated_at, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[User]
  }
}

