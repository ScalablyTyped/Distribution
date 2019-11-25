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
    val __obj = js.Dynamic.literal(closed_issues = closed_issues.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], due_on = due_on.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], open_issues = open_issues.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (closed_at != null) __obj.updateDynamic("closed_at")(closed_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Milestone]
  }
}

