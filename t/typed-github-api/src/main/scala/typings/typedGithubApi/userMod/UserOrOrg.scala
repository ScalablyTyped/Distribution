package typings.typedGithubApi.userMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserOrOrg extends UserOrOrgSummary {
  var blog: String = js.native
  var company: String = js.native
  var created_at: Date = js.native
  var email: String = js.native
  var followers: Double = js.native
  var following: Double = js.native
  var location: String = js.native
  var name: String = js.native
  var public_gists: Double = js.native
  var public_repos: Double = js.native
  var updated_at: Date = js.native
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
  @scala.inline
  implicit class UserOrOrgOps[Self <: UserOrOrg] (val x: Self) extends AnyVal {
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
    def setBlog(value: String): Self = this.set("blog", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: Date): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowers(value: Double): Self = this.set("followers", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowing(value: Double): Self = this.set("following", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic_gists(value: Double): Self = this.set("public_gists", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic_repos(value: Double): Self = this.set("public_repos", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: Date): Self = this.set("updated_at", value.asInstanceOf[js.Any])
  }
  
}

