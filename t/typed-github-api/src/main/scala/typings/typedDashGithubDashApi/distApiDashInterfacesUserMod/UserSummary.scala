package typings.typedDashGithubDashApi.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSummary extends UserOrOrgSummary {
  var followers_url: String
  var following_url: String
  var gists_url: String
  var gravatar_id: String
  var html_url: String
  var organizations_url: String
  var received_events_url: String
  var site_admin: Boolean
  var starred_url: String
  var subscriptions_url: String
  @JSName("type")
  var type_UserSummary: typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.User
}

object UserSummary {
  @scala.inline
  def apply(
    avatar_url: String,
    events_url: String,
    followers_url: String,
    following_url: String,
    gists_url: String,
    gravatar_id: String,
    html_url: String,
    id: Double,
    login: String,
    organizations_url: String,
    received_events_url: String,
    repos_url: String,
    site_admin: Boolean,
    starred_url: String,
    subscriptions_url: String,
    `type`: typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.User,
    url: String
  ): UserSummary = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, events_url = events_url, followers_url = followers_url, following_url = following_url, gists_url = gists_url, gravatar_id = gravatar_id, html_url = html_url, id = id, login = login, organizations_url = organizations_url, received_events_url = received_events_url, repos_url = repos_url, site_admin = site_admin, starred_url = starred_url, subscriptions_url = subscriptions_url, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UserSummary]
  }
}

