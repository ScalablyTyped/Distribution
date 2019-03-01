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
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("avatar_url")(avatar_url)
    __obj.updateDynamic("blog")(blog)
    __obj.updateDynamic("collaborators")(collaborators)
    __obj.updateDynamic("company")(company)
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("disk_usage")(disk_usage)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("events_url")(events_url)
    __obj.updateDynamic("followers")(followers)
    __obj.updateDynamic("following")(following)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("login")(login)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("owned_private_repos")(owned_private_repos)
    __obj.updateDynamic("plan")(plan)
    __obj.updateDynamic("private_gists")(private_gists)
    __obj.updateDynamic("public_gists")(public_gists)
    __obj.updateDynamic("public_repos")(public_repos)
    __obj.updateDynamic("repos_url")(repos_url)
    __obj.updateDynamic("total_private_repos")(total_private_repos)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PrivateUserOrOrg]
  }
}

