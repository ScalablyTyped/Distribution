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
    val __obj = js.Dynamic.literal(closedIssueCount = closedIssueCount, created = created, creator = creator, description = description, due = due, htmlUri = htmlUri, id = id, number = number, openIssueCount = openIssueCount, state = state.asInstanceOf[js.Any], title = title, updated = updated)
    if (closed != null) __obj.updateDynamic("closed")(closed)
    __obj.asInstanceOf[Milestone]
  }
}

