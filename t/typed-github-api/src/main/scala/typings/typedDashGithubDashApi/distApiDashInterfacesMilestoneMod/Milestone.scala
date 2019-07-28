package typings.typedDashGithubDashApi.distApiDashInterfacesMilestoneMod

import typings.std.Date
import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Milestone extends js.Object {
  var closed_at: Date | Null
  var closed_issues: Double
  var created_at: Date
  var creator: UserSummary
  var description: String
  var due_on: Date
  var html_url: String
  var id: Double
  var labels_url: String
  var number: Double
  var open_issues: Double
  var state: open | closed
  var title: String
  var updated_at: Date
  var url: String
}

object Milestone {
  @scala.inline
  def apply(
    closed_issues: Double,
    created_at: Date,
    creator: UserSummary,
    description: String,
    due_on: Date,
    html_url: String,
    id: Double,
    labels_url: String,
    number: Double,
    open_issues: Double,
    state: open | closed,
    title: String,
    updated_at: Date,
    url: String,
    closed_at: Date = null
  ): Milestone = {
    val __obj = js.Dynamic.literal(closed_issues = closed_issues, created_at = created_at, creator = creator, description = description, due_on = due_on, html_url = html_url, id = id, labels_url = labels_url, number = number, open_issues = open_issues, state = state.asInstanceOf[js.Any], title = title, updated_at = updated_at, url = url)
    if (closed_at != null) __obj.updateDynamic("closed_at")(closed_at)
    __obj.asInstanceOf[Milestone]
  }
}

