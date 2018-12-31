package typings
package typedDashGithubDashApiLib.distInterfacesIssueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends IssueRef {
  val age: momentLib.momentMod.momentNs.Duration
  var assignee: js.UndefOr[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary] = js.undefined
  var assignees: js.Array[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary]
  var body: java.lang.String
  var closed: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var closedBy: js.UndefOr[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary] = js.undefined
  var comments: scala.Double
  var created: momentLib.momentMod.momentNs.Moment
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
  var updated: momentLib.momentMod.momentNs.Moment
  def wasOpen(when: momentLib.momentMod.momentNs.Moment): scala.Boolean
}

