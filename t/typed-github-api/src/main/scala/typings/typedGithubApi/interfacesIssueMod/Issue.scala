package typings.typedGithubApi.interfacesIssueMod

import typings.moment.mod.Duration_
import typings.moment.mod.Moment
import typings.typedGithubApi.interfacesLabelMod.Label
import typings.typedGithubApi.interfacesMilestoneMod.Milestone
import typings.typedGithubApi.interfacesRepositoryMod.Repository
import typings.typedGithubApi.interfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issue extends IssueRef {
  val age: Duration_ = js.native
  var assignee: js.UndefOr[UserSummary] = js.native
  var assignees: js.Array[UserSummary] = js.native
  var body: String = js.native
  var closed: js.UndefOr[Moment] = js.native
  var closedBy: js.UndefOr[UserSummary] = js.native
  var comments: Double = js.native
  var created: Moment = js.native
  var createdBy: UserSummary = js.native
  var htmlUri: String = js.native
  var id: Double = js.native
  val isOpen: Boolean = js.native
  var isPullRequest: Boolean = js.native
  var labels: js.Array[Label] = js.native
  var locked: Boolean = js.native
  var milestone: js.UndefOr[Milestone] = js.native
  var state: open | closed = js.native
  var title: String = js.native
  var updated: Moment = js.native
  def wasOpen(when: Moment): Boolean = js.native
}

object Issue {
  @scala.inline
  def apply(
    age: Duration_,
    assignees: js.Array[UserSummary],
    body: String,
    comments: Double,
    created: Moment,
    createdBy: UserSummary,
    htmlUri: String,
    id: Double,
    isOpen: Boolean,
    isPullRequest: Boolean,
    labels: js.Array[Label],
    loadAsync: () => js.Promise[Issue | Null],
    loadRepositoryAsync: () => js.Promise[Repository],
    locked: Boolean,
    number: Double,
    state: open | closed,
    title: String,
    updated: Moment,
    wasOpen: Moment => Boolean
  ): Issue = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPullRequest = isPullRequest.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadRepositoryAsync = js.Any.fromFunction0(loadRepositoryAsync), locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], wasOpen = js.Any.fromFunction1(wasOpen))
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
    def setAge(value: Duration_): Self = this.set("age", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssigneesVarargs(value: UserSummary*): Self = this.set("assignees", js.Array(value :_*))
    @scala.inline
    def setAssignees(value: js.Array[UserSummary]): Self = this.set("assignees", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments(value: Double): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Moment): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedBy(value: UserSummary): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlUri(value: String): Self = this.set("htmlUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPullRequest(value: Boolean): Self = this.set("isPullRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelsVarargs(value: Label*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[Label]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: open | closed): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: Moment): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setWasOpen(value: Moment => Boolean): Self = this.set("wasOpen", js.Any.fromFunction1(value))
    @scala.inline
    def setAssignee(value: UserSummary): Self = this.set("assignee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignee: Self = this.set("assignee", js.undefined)
    @scala.inline
    def setClosed(value: Moment): Self = this.set("closed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    @scala.inline
    def setClosedBy(value: UserSummary): Self = this.set("closedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosedBy: Self = this.set("closedBy", js.undefined)
    @scala.inline
    def setMilestone(value: Milestone): Self = this.set("milestone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilestone: Self = this.set("milestone", js.undefined)
  }
  
}

