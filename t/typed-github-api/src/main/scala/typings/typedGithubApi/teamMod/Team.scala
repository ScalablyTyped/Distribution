package typings.typedGithubApi.teamMod

import typings.typedGithubApi.typedGithubApiStrings.admin
import typings.typedGithubApi.typedGithubApiStrings.closed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Team extends js.Object {
  var description: String = js.native
  var id: Double = js.native
  var members_url: String = js.native
  var name: String = js.native
  var permission: admin = js.native
  var privacy: closed = js.native
  var repositories_url: String = js.native
  var slug: String = js.native
  var url: String = js.native
}

object Team {
  @scala.inline
  def apply(
    description: String,
    id: Double,
    members_url: String,
    name: String,
    permission: admin,
    privacy: closed,
    repositories_url: String,
    slug: String,
    url: String
  ): Team = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Team]
  }
  @scala.inline
  implicit class TeamOps[Self <: Team] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMembers_url(value: String): Self = this.set("members_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermission(value: admin): Self = this.set("permission", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivacy(value: closed): Self = this.set("privacy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositories_url(value: String): Self = this.set("repositories_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

