package typings.typedDashGithubDashApi.distInterfacesIssueMod

import typings.moment.momentMod.Duration
import typings.moment.momentMod.Moment
import typings.typedDashGithubDashApi.distInterfacesLabelMod.Label
import typings.typedDashGithubDashApi.distInterfacesMilestoneMod.Milestone
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.Repository
import typings.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends IssueRef {
  val age: Duration
  var assignee: js.UndefOr[UserSummary] = js.undefined
  var assignees: js.Array[UserSummary]
  var body: String
  var closed: js.UndefOr[Moment] = js.undefined
  var closedBy: js.UndefOr[UserSummary] = js.undefined
  var comments: Double
  var created: Moment
  var createdBy: UserSummary
  var htmlUri: String
  var id: Double
  val isOpen: Boolean
  var isPullRequest: Boolean
  var labels: js.Array[Label]
  var locked: Boolean
  var milestone: js.UndefOr[Milestone] = js.undefined
  var state: open | closed
  var title: String
  var updated: Moment
  def wasOpen(when: Moment): Boolean
}

object Issue {
  @scala.inline
  def apply(
    age: Duration,
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
    wasOpen: Moment => Boolean,
    assignee: UserSummary = null,
    closed: Moment = null,
    closedBy: UserSummary = null,
    milestone: Milestone = null
  ): Issue = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPullRequest = isPullRequest.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadRepositoryAsync = js.Any.fromFunction0(loadRepositoryAsync), locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], wasOpen = js.Any.fromFunction1(wasOpen))
    if (assignee != null) __obj.updateDynamic("assignee")(assignee.asInstanceOf[js.Any])
    if (closed != null) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (closedBy != null) __obj.updateDynamic("closedBy")(closedBy.asInstanceOf[js.Any])
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
}

