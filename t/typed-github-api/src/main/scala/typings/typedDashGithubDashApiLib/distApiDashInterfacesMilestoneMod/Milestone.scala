package typings
package typedDashGithubDashApiLib.distApiDashInterfacesMilestoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Milestone extends js.Object {
  var closed_at: stdLib.Date | scala.Null
  var closed_issues: scala.Double
  var created_at: stdLib.Date
  var creator: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
  var description: java.lang.String
  var due_on: stdLib.Date
  var html_url: java.lang.String
  var id: scala.Double
  var labels_url: java.lang.String
  var number: scala.Double
  var open_issues: scala.Double
  var state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed
  var title: java.lang.String
  var updated_at: stdLib.Date
  var url: java.lang.String
}

object Milestone {
  @scala.inline
  def apply(
    closed_issues: scala.Double,
    created_at: stdLib.Date,
    creator: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary,
    description: java.lang.String,
    due_on: stdLib.Date,
    html_url: java.lang.String,
    id: scala.Double,
    labels_url: java.lang.String,
    number: scala.Double,
    open_issues: scala.Double,
    state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed,
    title: java.lang.String,
    updated_at: stdLib.Date,
    url: java.lang.String,
    closed_at: stdLib.Date = null
  ): Milestone = {
    val __obj = js.Dynamic.literal(closed_issues = closed_issues, created_at = created_at, creator = creator, description = description, due_on = due_on, html_url = html_url, id = id, labels_url = labels_url, number = number, open_issues = open_issues, state = state.asInstanceOf[js.Any], title = title, updated_at = updated_at, url = url)
    if (closed_at != null) __obj.updateDynamic("closed_at")(closed_at)
    __obj.asInstanceOf[Milestone]
  }
}

