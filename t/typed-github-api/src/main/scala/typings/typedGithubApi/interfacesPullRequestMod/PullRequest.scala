package typings.typedGithubApi.interfacesPullRequestMod

import typings.moment.mod.Moment
import typings.typedGithubApi.interfacesBranchMod.BranchSummary
import typings.typedGithubApi.interfacesBranchMod.BranchSummaryWithRepository
import typings.typedGithubApi.interfacesIssueMod.Issue
import typings.typedGithubApi.interfacesMilestoneMod.Milestone
import typings.typedGithubApi.interfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequest extends PullRequestRef {
  var assignee: UserSummary | Null = js.native
  var assignees: js.Array[UserSummary] = js.native
  var base: BranchSummaryWithRepository = js.native
  var body: String = js.native
  var closedAt: js.UndefOr[Moment] = js.native
  var createdAt: Moment = js.native
  var createdBy: UserSummary = js.native
  var head: BranchSummary = js.native
  var htmlUri: String = js.native
  var id: Double = js.native
  var locked: Boolean = js.native
  var mergedAt: js.UndefOr[Moment] = js.native
  var milestone: Milestone | Null = js.native
  var state: open | closed = js.native
  var title: String = js.native
  var updatedAt: Moment = js.native
  def loadIssueAsync(): js.Promise[Issue] = js.native
  def loadReviewCommentsAsync(): js.Promise[js.Array[ReviewComment]] = js.native
  def loadReviewRequestsAsync(): js.Promise[ReviewRequests] = js.native
  def loadReviewsAsync(): js.Promise[js.Array[Review]] = js.native
}

object PullRequest {
  @scala.inline
  def apply(
    assignees: js.Array[UserSummary],
    base: BranchSummaryWithRepository,
    body: String,
    createdAt: Moment,
    createdBy: UserSummary,
    head: BranchSummary,
    htmlUri: String,
    id: Double,
    loadAsync: () => js.Promise[PullRequest | Null],
    loadIssueAsync: () => js.Promise[Issue],
    loadReviewCommentsAsync: () => js.Promise[js.Array[ReviewComment]],
    loadReviewRequestsAsync: () => js.Promise[ReviewRequests],
    loadReviewsAsync: () => js.Promise[js.Array[Review]],
    locked: Boolean,
    number: Double,
    state: open | closed,
    title: String,
    updatedAt: Moment
  ): PullRequest = {
    val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadIssueAsync = js.Any.fromFunction0(loadIssueAsync), loadReviewCommentsAsync = js.Any.fromFunction0(loadReviewCommentsAsync), loadReviewRequestsAsync = js.Any.fromFunction0(loadReviewRequestsAsync), loadReviewsAsync = js.Any.fromFunction0(loadReviewsAsync), locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequest]
  }
  @scala.inline
  implicit class PullRequestOps[Self <: PullRequest] (val x: Self) extends AnyVal {
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
    def setBase(value: BranchSummaryWithRepository): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAt(value: Moment): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedBy(value: UserSummary): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setHead(value: BranchSummary): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlUri(value: String): Self = this.set("htmlUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadIssueAsync(value: () => js.Promise[Issue]): Self = this.set("loadIssueAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadReviewCommentsAsync(value: () => js.Promise[js.Array[ReviewComment]]): Self = this.set("loadReviewCommentsAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadReviewRequestsAsync(value: () => js.Promise[ReviewRequests]): Self = this.set("loadReviewRequestsAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadReviewsAsync(value: () => js.Promise[js.Array[Review]]): Self = this.set("loadReviewsAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: open | closed): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: Moment): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignee(value: UserSummary): Self = this.set("assignee", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssigneeNull: Self = this.set("assignee", null)
    @scala.inline
    def setClosedAt(value: Moment): Self = this.set("closedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosedAt: Self = this.set("closedAt", js.undefined)
    @scala.inline
    def setMergedAt(value: Moment): Self = this.set("mergedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergedAt: Self = this.set("mergedAt", js.undefined)
    @scala.inline
    def setMilestone(value: Milestone): Self = this.set("milestone", value.asInstanceOf[js.Any])
    @scala.inline
    def setMilestoneNull: Self = this.set("milestone", null)
  }
  
}

