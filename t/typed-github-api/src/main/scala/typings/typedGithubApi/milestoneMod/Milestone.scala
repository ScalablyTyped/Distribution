package typings.typedGithubApi.milestoneMod

import typings.std.Date
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Milestone extends js.Object {
  var closed_at: Date | Null = js.native
  var closed_issues: Double = js.native
  var created_at: Date = js.native
  var creator: UserSummary = js.native
  var description: String = js.native
  var due_on: Date = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var labels_url: String = js.native
  var number: Double = js.native
  var open_issues: Double = js.native
  var state: open | closed = js.native
  var title: String = js.native
  var updated_at: Date = js.native
  var url: String = js.native
}

object Milestone {
  @scala.inline
  def apply(
    closed_issues: Double,
    created_at: Date,
    creator: UserSummary,
    description: String,
    due_on: Date,
    html_url: String,
    id: Double,
    labels_url: String,
    number: Double,
    open_issues: Double,
    state: open | closed,
    title: String,
    updated_at: Date,
    url: String
  ): Milestone = {
    val __obj = js.Dynamic.literal(closed_issues = closed_issues.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], due_on = due_on.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], open_issues = open_issues.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Milestone]
  }
  @scala.inline
  implicit class MilestoneOps[Self <: Milestone] (val x: Self) extends AnyVal {
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
    def setClosed_issues(value: Double): Self = this.set("closed_issues", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: Date): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: UserSummary): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDue_on(value: Date): Self = this.set("due_on", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels_url(value: String): Self = this.set("labels_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen_issues(value: Double): Self = this.set("open_issues", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: open | closed): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: Date): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosed_at(value: Date): Self = this.set("closed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosed_atNull: Self = this.set("closed_at", null)
  }
  
}

