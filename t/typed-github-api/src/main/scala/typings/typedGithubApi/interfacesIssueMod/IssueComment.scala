package typings.typedGithubApi.interfacesIssueMod

import typings.moment.mod.Moment
import typings.typedGithubApi.interfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueComment extends js.Object {
  var body: String = js.native
  var createdAt: Moment = js.native
  var createdBy: UserSummary = js.native
  var htmlUri: String = js.native
  var id: Double = js.native
  var updatedAt: Moment = js.native
}

object IssueComment {
  @scala.inline
  def apply(
    body: String,
    createdAt: Moment,
    createdBy: UserSummary,
    htmlUri: String,
    id: Double,
    updatedAt: Moment
  ): IssueComment = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
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
    def setCreatedAt(value: Moment): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedBy(value: UserSummary): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlUri(value: String): Self = this.set("htmlUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: Moment): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
  }
  
}

