package typings
package typedDashGithubDashApiLib.distInterfacesPullDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequest extends PullRequestRef {
  var assignee: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary | scala.Null
  var assignees: js.Array[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary]
  var base: typedDashGithubDashApiLib.distInterfacesBranchMod.BranchSummaryWithRepository
  var body: java.lang.String
  var closedAt: js.UndefOr[momentLib.momentMod.Moment] = js.undefined
  var createdAt: momentLib.momentMod.Moment
  var createdBy: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary
  var head: typedDashGithubDashApiLib.distInterfacesBranchMod.BranchSummary
  var htmlUri: java.lang.String
  var id: scala.Double
  var locked: scala.Boolean
  var mergedAt: js.UndefOr[momentLib.momentMod.Moment] = js.undefined
  var milestone: typedDashGithubDashApiLib.distInterfacesMilestoneMod.Milestone | scala.Null
  var state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed
  var title: java.lang.String
  var updatedAt: momentLib.momentMod.Moment
  def loadIssueAsync(): js.Promise[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]
  def loadReviewCommentsAsync(): js.Promise[js.Array[ReviewComment]]
  def loadReviewRequestsAsync(): js.Promise[ReviewRequests]
  def loadReviewsAsync(): js.Promise[js.Array[Review]]
}

object PullRequest {
  @scala.inline
  def apply(
    assignees: js.Array[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary],
    base: typedDashGithubDashApiLib.distInterfacesBranchMod.BranchSummaryWithRepository,
    body: java.lang.String,
    createdAt: momentLib.momentMod.Moment,
    createdBy: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary,
    head: typedDashGithubDashApiLib.distInterfacesBranchMod.BranchSummary,
    htmlUri: java.lang.String,
    id: scala.Double,
    loadAsync: () => js.Promise[PullRequest | scala.Null],
    loadIssueAsync: () => js.Promise[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue],
    loadReviewCommentsAsync: () => js.Promise[js.Array[ReviewComment]],
    loadReviewRequestsAsync: () => js.Promise[ReviewRequests],
    loadReviewsAsync: () => js.Promise[js.Array[Review]],
    locked: scala.Boolean,
    number: scala.Double,
    state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed,
    title: java.lang.String,
    updatedAt: momentLib.momentMod.Moment,
    assignee: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary = null,
    closedAt: momentLib.momentMod.Moment = null,
    mergedAt: momentLib.momentMod.Moment = null,
    milestone: typedDashGithubDashApiLib.distInterfacesMilestoneMod.Milestone = null
  ): PullRequest = {
    val __obj = js.Dynamic.literal(assignees = assignees, base = base, body = body, createdAt = createdAt, createdBy = createdBy, head = head, htmlUri = htmlUri, id = id, loadAsync = js.Any.fromFunction0(loadAsync), loadIssueAsync = js.Any.fromFunction0(loadIssueAsync), loadReviewCommentsAsync = js.Any.fromFunction0(loadReviewCommentsAsync), loadReviewRequestsAsync = js.Any.fromFunction0(loadReviewRequestsAsync), loadReviewsAsync = js.Any.fromFunction0(loadReviewsAsync), locked = locked, number = number, state = state.asInstanceOf[js.Any], title = title, updatedAt = updatedAt)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (closedAt != null) __obj.updateDynamic("closedAt")(closedAt)
    if (mergedAt != null) __obj.updateDynamic("mergedAt")(mergedAt)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone)
    __obj.asInstanceOf[PullRequest]
  }
}

