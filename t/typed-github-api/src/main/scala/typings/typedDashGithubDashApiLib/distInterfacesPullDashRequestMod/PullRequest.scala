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

