package typings.typedGithubApi.userMod

import typings.std.Date
import typings.typedGithubApi.AnonCollaborators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateUserOrOrg extends UserOrOrg {
  var collaborators: Double
  var disk_usage: Double
  var owned_private_repos: Double
  var plan: AnonCollaborators
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
    plan: AnonCollaborators,
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
}

