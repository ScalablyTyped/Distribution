package typings
package typedDashGithubDashApiLib.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateUserOrOrg extends UserOrOrg {
  var collaborators: scala.Double
  var disk_usage: scala.Double
  var owned_private_repos: scala.Double
  var plan: typedDashGithubDashApiLib.Anon_Collaborators
  var private_gists: scala.Double
  var total_private_repos: scala.Double
}

object PrivateUserOrOrg {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    blog: java.lang.String,
    collaborators: scala.Double,
    company: java.lang.String,
    created_at: stdLib.Date,
    disk_usage: scala.Double,
    email: java.lang.String,
    events_url: java.lang.String,
    followers: scala.Double,
    following: scala.Double,
    id: scala.Double,
    location: java.lang.String,
    login: java.lang.String,
    name: java.lang.String,
    owned_private_repos: scala.Double,
    plan: typedDashGithubDashApiLib.Anon_Collaborators,
    private_gists: scala.Double,
    public_gists: scala.Double,
    public_repos: scala.Double,
    repos_url: java.lang.String,
    total_private_repos: scala.Double,
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.User | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.Organization,
    updated_at: stdLib.Date,
    url: java.lang.String
  ): PrivateUserOrOrg = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, blog = blog, collaborators = collaborators, company = company, created_at = created_at, disk_usage = disk_usage, email = email, events_url = events_url, followers = followers, following = following, id = id, location = location, login = login, name = name, owned_private_repos = owned_private_repos, plan = plan, private_gists = private_gists, public_gists = public_gists, public_repos = public_repos, repos_url = repos_url, total_private_repos = total_private_repos, updated_at = updated_at, url = url)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateUserOrOrg]
  }
}

