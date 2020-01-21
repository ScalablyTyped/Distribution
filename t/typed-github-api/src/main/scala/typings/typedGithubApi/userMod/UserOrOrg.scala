package typings.typedGithubApi.userMod

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
    `type`: typings.typedGithubApi.typedGithubApiStrings.User | typings.typedGithubApi.typedGithubApiStrings.Organization,
    updated_at: Date,
    url: String
  ): UserOrOrg = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOrOrg]
  }
}

