package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessesData extends js.Object {
  var all: scala.Double
  var blocked: scala.Double
  var list: js.Array[ProcessesProcessData]
  var running: scala.Double
  var sleeping: scala.Double
}

object ProcessesData {
  @scala.inline
  def apply(
    all: scala.Double,
    blocked: scala.Double,
    list: js.Array[ProcessesProcessData],
    running: scala.Double,
    sleeping: scala.Double
  ): ProcessesData = {
    val __obj = js.Dynamic.literal(all = all, blocked = blocked, list = list, running = running, sleeping = sleeping)
  
    __obj.asInstanceOf[ProcessesData]
  }
}

