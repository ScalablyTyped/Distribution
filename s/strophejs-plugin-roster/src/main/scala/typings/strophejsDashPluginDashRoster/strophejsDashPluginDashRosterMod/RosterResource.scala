package typings.strophejsDashPluginDashRoster.strophejsDashPluginDashRosterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RosterResource extends js.Object {
  var priority: String
  var show: String
  var status: String
}

object RosterResource {
  @scala.inline
  def apply(priority: String, show: String, status: String): RosterResource = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RosterResource]
  }
}

