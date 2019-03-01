package typings
package typedDashGithubDashApiLib.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserOrOrg because var conflicts: avatar_url, events_url, id, login, repos_url, `type`, url. Inlined name, company, blog, location, email, public_repos, public_gists, followers, following, created_at, updated_at */ trait User extends UserSummary {
  var bio: java.lang.String
  var blog: java.lang.String
  var company: java.lang.String
  var created_at: stdLib.Date
  var email: java.lang.String
  var followers: scala.Double
  var following: scala.Double
  var hireable: scala.Boolean
  var location: java.lang.String
  var name: java.lang.String
  var public_gists: scala.Double
  var public_repos: scala.Double
  var updated_at: stdLib.Date
}

object User {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    bio: java.lang.String,
    blog: java.lang.String,
    company: java.lang.String,
    created_at: stdLib.Date,
    email: java.lang.String,
    events_url: java.lang.String,
    followers: scala.Double,
    followers_url: java.lang.String,
    following: scala.Double,
    following_url: java.lang.String,
    gists_url: java.lang.String,
    gravatar_id: java.lang.String,
    hireable: scala.Boolean,
    html_url: java.lang.String,
    id: scala.Double,
    location: java.lang.String,
    login: java.lang.String,
    name: java.lang.String,
    organizations_url: java.lang.String,
    public_gists: scala.Double,
    public_repos: scala.Double,
    received_events_url: java.lang.String,
    repos_url: java.lang.String,
    site_admin: scala.Boolean,
    starred_url: java.lang.String,
    subscriptions_url: java.lang.String,
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.User,
    updated_at: stdLib.Date,
    url: java.lang.String
  ): User = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("avatar_url")(avatar_url)
    __obj.updateDynamic("bio")(bio)
    __obj.updateDynamic("blog")(blog)
    __obj.updateDynamic("company")(company)
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("events_url")(events_url)
    __obj.updateDynamic("followers")(followers)
    __obj.updateDynamic("followers_url")(followers_url)
    __obj.updateDynamic("following")(following)
    __obj.updateDynamic("following_url")(following_url)
    __obj.updateDynamic("gists_url")(gists_url)
    __obj.updateDynamic("gravatar_id")(gravatar_id)
    __obj.updateDynamic("hireable")(hireable)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("login")(login)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("organizations_url")(organizations_url)
    __obj.updateDynamic("public_gists")(public_gists)
    __obj.updateDynamic("public_repos")(public_repos)
    __obj.updateDynamic("received_events_url")(received_events_url)
    __obj.updateDynamic("repos_url")(repos_url)
    __obj.updateDynamic("site_admin")(site_admin)
    __obj.updateDynamic("starred_url")(starred_url)
    __obj.updateDynamic("subscriptions_url")(subscriptions_url)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[User]
  }
}

