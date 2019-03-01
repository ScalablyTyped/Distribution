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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closed_issues")(closed_issues)
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("creator")(creator)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("due_on")(due_on)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("labels_url")(labels_url)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("open_issues")(open_issues)
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.updateDynamic("url")(url)
    if (closed_at != null) __obj.updateDynamic("closed_at")(closed_at)
    __obj.asInstanceOf[Milestone]
  }
}

