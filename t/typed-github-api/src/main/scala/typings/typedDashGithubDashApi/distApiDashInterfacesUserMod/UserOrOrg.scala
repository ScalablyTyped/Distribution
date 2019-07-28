package typings.typedDashGithubDashApi.distApiDashInterfacesUserMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOrOrg extends UserOrOrgSummary {
  var blog: String
  var company: String
  var created_at: Date
  var email: String
  var followers: Double
  var following: Double
  var location: String
  var name: String
  var public_gists: Double
  var public_repos: Double
  var updated_at: Date
}

object UserOrOrg {
  @scala.inline
  def apply(
    avatar_url: String,
    blog: String,
    company: String,
    created_at: Date,
    email: String,
    events_url: String,
    followers: Double,
    following: Double,
    id: Double,
    location: String,
    login: String,
    name: String,
    public_gists: Double,
    public_repos: Double,
    repos_url: String,
    `type`: typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.User | typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.Organization,
    updated_at: Date,
    url: String
  ): UserOrOrg = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, blog = blog, company = company, created_at = created_at, email = email, events_url = events_url, followers = followers, following = following, id = id, location = location, login = login, name = name, public_gists = public_gists, public_repos = public_repos, repos_url = repos_url, updated_at = updated_at, url = url)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOrOrg]
  }
}

