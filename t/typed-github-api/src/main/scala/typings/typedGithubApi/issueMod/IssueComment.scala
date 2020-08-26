package typings.typedGithubApi.issueMod

import typings.std.Date
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueComment extends js.Object {
  var body: String = js.native
  var created_at: Date = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var updated_at: Date = js.native
  var url: String = js.native
  var user: UserSummary = js.native
}

object IssueComment {
  @scala.inline
  def apply(
    body: String,
    created_at: Date,
    html_url: String,
    id: Double,
    updated_at: Date,
    url: String,
    user: UserSummary
  ): IssueComment = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueComment]
  }
  @scala.inline
  implicit class IssueCommentOps[Self <: IssueComment] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: Date): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: Date): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: UserSummary): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

