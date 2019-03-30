package typings
package strophejsDashPluginDashRosterLib.strophejsDashPluginDashRosterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RosterResource extends js.Object {
  var priority: java.lang.String
  var show: java.lang.String
  var status: java.lang.String
}

object RosterResource {
  @scala.inline
  def apply(priority: java.lang.String, show: java.lang.String, status: java.lang.String): RosterResource = {
    val __obj = js.Dynamic.literal(priority = priority, show = show, status = status)
  
    __obj.asInstanceOf[RosterResource]
  }
}

