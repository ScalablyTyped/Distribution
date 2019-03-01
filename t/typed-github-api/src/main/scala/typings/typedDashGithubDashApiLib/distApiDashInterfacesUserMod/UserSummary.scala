package typings
package typedDashGithubDashApiLib.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSummary extends UserOrOrgSummary {
  var followers_url: java.lang.String
  var following_url: java.lang.String
  var gists_url: java.lang.String
  var gravatar_id: java.lang.String
  var html_url: java.lang.String
  var organizations_url: java.lang.String
  var received_events_url: java.lang.String
  var site_admin: scala.Boolean
  var starred_url: java.lang.String
  var subscriptions_url: java.lang.String
  @JSName("type")
  var type_UserSummary: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.User
}

object UserSummary {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    events_url: java.lang.String,
    followers_url: java.lang.String,
    following_url: java.lang.String,
    gists_url: java.lang.String,
    gravatar_id: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    login: java.lang.String,
    organizations_url: java.lang.String,
    received_events_url: java.lang.String,
    repos_url: java.lang.String,
    site_admin: scala.Boolean,
    starred_url: java.lang.String,
    subscriptions_url: java.lang.String,
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.User,
    url: java.lang.String
  ): UserSummary = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("avatar_url")(avatar_url)
    __obj.updateDynamic("events_url")(events_url)
    __obj.updateDynamic("followers_url")(followers_url)
    __obj.updateDynamic("following_url")(following_url)
    __obj.updateDynamic("gists_url")(gists_url)
    __obj.updateDynamic("gravatar_id")(gravatar_id)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("login")(login)
    __obj.updateDynamic("organizations_url")(organizations_url)
    __obj.updateDynamic("received_events_url")(received_events_url)
    __obj.updateDynamic("repos_url")(repos_url)
    __obj.updateDynamic("site_admin")(site_admin)
    __obj.updateDynamic("starred_url")(starred_url)
    __obj.updateDynamic("subscriptions_url")(subscriptions_url)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[UserSummary]
  }
}

