package typings.typedDashGithubDashApi.distApiDashInterfacesUserMod

import typings.std.Date
import typings.typedDashGithubDashApi.Anon_Collaborators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateUserOrOrg extends UserOrOrg {
  var collaborators: Double
  var disk_usage: Double
  var owned_private_repos: Double
  var plan: Anon_Collaborators
  var private_gists: Double
  var total_private_repos: Double
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
    plan: Anon_Collaborators,
    private_gists: Double,
    public_gists: Double,
    public_repos: Double,
    repos_url: String,
    total_private_repos: Double,
    `type`: typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.User | typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.Organization,
    updated_at: Date,
    url: String
  ): PrivateUserOrOrg = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, blog = blog, collaborators = collaborators, company = company, created_at = created_at, disk_usage = disk_usage, email = email, events_url = events_url, followers = followers, following = following, id = id, location = location, login = login, name = name, owned_private_repos = owned_private_repos, plan = plan, private_gists = private_gists, public_gists = public_gists, public_repos = public_repos, repos_url = repos_url, total_private_repos = total_private_repos, updated_at = updated_at, url = url)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateUserOrOrg]
  }
}

