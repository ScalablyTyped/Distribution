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
  var closedAt: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var createdAt: momentLib.momentMod.momentNs.Moment
  var createdBy: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary
  var head: typedDashGithubDashApiLib.distInterfacesBranchMod.BranchSummary
  var htmlUri: java.lang.String
  var id: scala.Double
  var locked: scala.Boolean
  var mergedAt: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var milestone: typedDashGithubDashApiLib.distInterfacesMilestoneMod.Milestone | scala.Null
  var state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed
  var title: java.lang.String
  var updatedAt: momentLib.momentMod.momentNs.Moment
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
    createdAt: momentLib.momentMod.momentNs.Moment,
    createdBy: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary,
    head: typedDashGithubDashApiLib.distInterfacesBranchMod.BranchSummary,
    htmlUri: java.lang.String,
    id: scala.Double,
    loadAsync: js.Function0[js.Promise[PullRequest | scala.Null]],
    loadIssueAsync: js.Function0[js.Promise[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]],
    loadReviewCommentsAsync: js.Function0[js.Promise[js.Array[ReviewComment]]],
    loadReviewRequestsAsync: js.Function0[js.Promise[ReviewRequests]],
    loadReviewsAsync: js.Function0[js.Promise[js.Array[Review]]],
    locked: scala.Boolean,
    number: scala.Double,
    state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed,
    title: java.lang.String,
    updatedAt: momentLib.momentMod.momentNs.Moment,
    assignee: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary = null,
    closedAt: momentLib.momentMod.momentNs.Moment = null,
    mergedAt: momentLib.momentMod.momentNs.Moment = null,
    milestone: typedDashGithubDashApiLib.distInterfacesMilestoneMod.Milestone = null
  ): PullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assignees")(assignees)
    __obj.updateDynamic("base")(base)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("createdAt")(createdAt)
    __obj.updateDynamic("createdBy")(createdBy)
    __obj.updateDynamic("head")(head)
    __obj.updateDynamic("htmlUri")(htmlUri)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("loadAsync")(loadAsync)
    __obj.updateDynamic("loadIssueAsync")(loadIssueAsync)
    __obj.updateDynamic("loadReviewCommentsAsync")(loadReviewCommentsAsync)
    __obj.updateDynamic("loadReviewRequestsAsync")(loadReviewRequestsAsync)
    __obj.updateDynamic("loadReviewsAsync")(loadReviewsAsync)
    __obj.updateDynamic("locked")(locked)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("updatedAt")(updatedAt)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (closedAt != null) __obj.updateDynamic("closedAt")(closedAt)
    if (mergedAt != null) __obj.updateDynamic("mergedAt")(mergedAt)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone)
    __obj.asInstanceOf[PullRequest]
  }
}

