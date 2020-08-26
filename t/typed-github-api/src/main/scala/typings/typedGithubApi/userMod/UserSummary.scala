package typings.typedGithubApi.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSummary extends UserOrOrgSummary {
  var followers_url: String = js.native
  var following_url: String = js.native
  var gists_url: String = js.native
  var gravatar_id: String = js.native
  var html_url: String = js.native
  var organizations_url: String = js.native
  var received_events_url: String = js.native
  var site_admin: Boolean = js.native
  var starred_url: String = js.native
  var subscriptions_url: String = js.native
  @JSName("type")
  var type_UserSummary: typings.typedGithubApi.typedGithubApiStrings.User = js.native
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
    `type`: typings.typedGithubApi.typedGithubApiStrings.User,
    url: String
  ): UserSummary = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], following_url = following_url.asInstanceOf[js.Any], gists_url = gists_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], site_admin = site_admin.asInstanceOf[js.Any], starred_url = starred_url.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSummary]
  }
  @scala.inline
  implicit class UserSummaryOps[Self <: UserSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFollowers_url(value: String): Self = this.set("followers_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowing_url(value: String): Self = this.set("following_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setGists_url(value: String): Self = this.set("gists_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setGravatar_id(value: String): Self = this.set("gravatar_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizations_url(value: String): Self = this.set("organizations_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceived_events_url(value: String): Self = this.set("received_events_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setSite_admin(value: Boolean): Self = this.set("site_admin", value.asInstanceOf[js.Any])
    @scala.inline
    def setStarred_url(value: String): Self = this.set("starred_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptions_url(value: String): Self = this.set("subscriptions_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.typedGithubApi.typedGithubApiStrings.User): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

