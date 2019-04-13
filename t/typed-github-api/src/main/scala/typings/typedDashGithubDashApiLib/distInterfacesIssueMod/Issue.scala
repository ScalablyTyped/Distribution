package typings
package typedDashGithubDashApiLib.distInterfacesIssueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends IssueRef {
  val age: momentLib.momentMod.Duration
  var assignee: js.UndefOr[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary] = js.undefined
  var assignees: js.Array[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary]
  var body: java.lang.String
  var closed: js.UndefOr[momentLib.momentMod.Moment] = js.undefined
  var closedBy: js.UndefOr[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary] = js.undefined
  var comments: scala.Double
  var created: momentLib.momentMod.Moment
  var createdBy: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary
  var htmlUri: java.lang.String
  var id: scala.Double
  val isOpen: scala.Boolean
  var isPullRequest: scala.Boolean
  var labels: js.Array[typedDashGithubDashApiLib.distInterfacesLabelMod.Label]
  var locked: scala.Boolean
  var milestone: js.UndefOr[typedDashGithubDashApiLib.distInterfacesMilestoneMod.Milestone] = js.undefined
  var state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed
  var title: java.lang.String
  var updated: momentLib.momentMod.Moment
  def wasOpen(when: momentLib.momentMod.Moment): scala.Boolean
}

object Issue {
  @scala.inline
  def apply(
    age: momentLib.momentMod.Duration,
    assignees: js.Array[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary],
    body: java.lang.String,
    comments: scala.Double,
    created: momentLib.momentMod.Moment,
    createdBy: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary,
    htmlUri: java.lang.String,
    id: scala.Double,
    isOpen: scala.Boolean,
    isPullRequest: scala.Boolean,
    labels: js.Array[typedDashGithubDashApiLib.distInterfacesLabelMod.Label],
    loadAsync: () => js.Promise[Issue | scala.Null],
    loadRepositoryAsync: () => js.Promise[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository],
    locked: scala.Boolean,
    number: scala.Double,
    state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed,
    title: java.lang.String,
    updated: momentLib.momentMod.Moment,
    wasOpen: momentLib.momentMod.Moment => scala.Boolean,
    assignee: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary = null,
    closed: momentLib.momentMod.Moment = null,
    closedBy: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary = null,
    milestone: typedDashGithubDashApiLib.distInterfacesMilestoneMod.Milestone = null
  ): Issue = {
    val __obj = js.Dynamic.literal(age = age, assignees = assignees, body = body, comments = comments, created = created, createdBy = createdBy, htmlUri = htmlUri, id = id, isOpen = isOpen, isPullRequest = isPullRequest, labels = labels, loadAsync = js.Any.fromFunction0(loadAsync), loadRepositoryAsync = js.Any.fromFunction0(loadRepositoryAsync), locked = locked, number = number, state = state.asInstanceOf[js.Any], title = title, updated = updated, wasOpen = js.Any.fromFunction1(wasOpen))
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (closed != null) __obj.updateDynamic("closed")(closed)
    if (closedBy != null) __obj.updateDynamic("closedBy")(closedBy)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone)
    __obj.asInstanceOf[Issue]
  }
}

