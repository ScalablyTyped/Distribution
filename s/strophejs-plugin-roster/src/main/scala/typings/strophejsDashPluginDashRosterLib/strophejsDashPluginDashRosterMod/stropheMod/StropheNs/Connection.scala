package typings
package strophejsDashPluginDashRosterLib.strophejsDashPluginDashRosterMod.stropheMod.StropheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var roster: strophejsDashPluginDashRosterLib.strophejsDashPluginDashRosterMod.StropheRosterPlugin
}

object Connection {
  @scala.inline
  def apply(roster: strophejsDashPluginDashRosterLib.strophejsDashPluginDashRosterMod.StropheRosterPlugin): Connection = {
    val __obj = js.Dynamic.literal(roster = roster)
  
    __obj.asInstanceOf[Connection]
  }
}

