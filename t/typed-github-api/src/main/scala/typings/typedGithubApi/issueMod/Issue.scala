package typings.typedGithubApi.issueMod

import typings.std.Date
import typings.typedGithubApi.labelMod.Label
import typings.typedGithubApi.milestoneMod.Milestone
import typings.typedGithubApi.repositoryMod.Repository
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issue extends js.Object {
  var assignee: UserSummary | Null = js.native
  var assignees: js.Array[UserSummary] = js.native
  var body: String = js.native
  var closed_at: Date | Null = js.native
  var closed_by: UserSummary | Null = js.native
  var comments: Double = js.native
  var comments_url: String = js.native
  var created_at: Date = js.native
  var events_url: String = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var labels: js.Array[Label] = js.native
  var labels_url: String = js.native
  var locked: Boolean = js.native
  var milestone: Milestone | Null = js.native
  var number: Double = js.native
  var pull_request: js.UndefOr[PullRequestExtension] = js.native
  var repository: js.UndefOr[Repository] = js.native
  var repository_url: String = js.native
  var state: open | closed = js.native
  var title: String = js.native
  var updated_at: Date = js.native
  var url: String = js.native
  var user: UserSummary = js.native
}

object Issue {
  @scala.inline
  def apply(
    assignees: js.Array[UserSummary],
    body: String,
    comments: Double,
    comments_url: String,
    created_at: Date,
    events_url: String,
    html_url: String,
    id: Double,
    labels: js.Array[Label],
    labels_url: String,
    locked: Boolean,
    number: Double,
    repository_url: String,
    state: open | closed,
    title: String,
    updated_at: Date,
    url: String,
    user: UserSummary
  ): Issue = {
    val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
  @scala.inline
  implicit class IssueOps[Self <: Issue] (val x: Self) extends AnyVal {
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
    def setAssigneesVarargs(value: UserSummary*): Self = this.set("assignees", js.Array(value :_*))
    @scala.inline
    def setAssignees(value: js.Array[UserSummary]): Self = this.set("assignees", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments(value: Double): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments_url(value: String): Self = this.set("comments_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: Date): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvents_url(value: String): Self = this.set("events_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelsVarargs(value: Label*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[Label]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels_url(value: String): Self = this.set("labels_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository_url(value: String): Self = this.set("repository_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: open | closed): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: Date): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: UserSummary): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignee(value: UserSummary): Self = this.set("assignee", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssigneeNull: Self = this.set("assignee", null)
    @scala.inline
    def setClosed_at(value: Date): Self = this.set("closed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosed_atNull: Self = this.set("closed_at", null)
    @scala.inline
    def setClosed_by(value: UserSummary): Self = this.set("closed_by", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosed_byNull: Self = this.set("closed_by", null)
    @scala.inline
    def setMilestone(value: Milestone): Self = this.set("milestone", value.asInstanceOf[js.Any])
    @scala.inline
    def setMilestoneNull: Self = this.set("milestone", null)
    @scala.inline
    def setPull_request(value: PullRequestExtension): Self = this.set("pull_request", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePull_request: Self = this.set("pull_request", js.undefined)
    @scala.inline
    def setRepository(value: Repository): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
  }
  
}

