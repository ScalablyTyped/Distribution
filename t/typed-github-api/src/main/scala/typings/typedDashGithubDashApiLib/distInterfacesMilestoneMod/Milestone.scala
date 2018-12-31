package typings
package typedDashGithubDashApiLib.distInterfacesMilestoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Milestone extends js.Object {
  var closed: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var closedIssueCount: scala.Double
  var created: momentLib.momentMod.momentNs.Moment
  var creator: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary
  var description: java.lang.String
  var due: momentLib.momentMod.momentNs.Moment
  var htmlUri: java.lang.String
  var id: scala.Double
  var number: scala.Double
  var openIssueCount: scala.Double
  var state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed
  var title: java.lang.String
  var updated: momentLib.momentMod.momentNs.Moment
}

