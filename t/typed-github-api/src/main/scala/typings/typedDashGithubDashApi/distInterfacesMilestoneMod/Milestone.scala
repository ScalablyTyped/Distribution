package typings.typedDashGithubDashApi.distInterfacesMilestoneMod

import typings.moment.momentMod.Moment
import typings.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Milestone extends js.Object {
  var closed: js.UndefOr[Moment] = js.undefined
  var closedIssueCount: Double
  var created: Moment
  var creator: UserSummary
  var description: String
  var due: Moment
  var htmlUri: String
  var id: Double
  var number: Double
  var openIssueCount: Double
  var state: open | closed
  var title: String
  var updated: Moment
}

object Milestone {
  @scala.inline
  def apply(
    closedIssueCount: Double,
    created: Moment,
    creator: UserSummary,
    description: String,
    due: Moment,
    htmlUri: String,
    id: Double,
    number: Double,
    openIssueCount: Double,
    state: open | closed,
    title: String,
    updated: Moment,
    closed: Moment = null
  ): Milestone = {
    val __obj = js.Dynamic.literal(closedIssueCount = closedIssueCount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], due = due.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], openIssueCount = openIssueCount.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    if (closed != null) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Milestone]
  }
}

