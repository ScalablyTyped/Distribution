package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemData extends js.Object {
  var active: scala.Double
  var available: scala.Double
  var buffcache: scala.Double
  var free: scala.Double
  var swapfree: scala.Double
  var swaptotal: scala.Double
  var swapused: scala.Double
  var total: scala.Double
  var used: scala.Double
}

object MemData {
  @scala.inline
  def apply(
    active: scala.Double,
    available: scala.Double,
    buffcache: scala.Double,
    free: scala.Double,
    swapfree: scala.Double,
    swaptotal: scala.Double,
    swapused: scala.Double,
    total: scala.Double,
    used: scala.Double
  ): MemData = {
    val __obj = js.Dynamic.literal(active = active, available = available, buffcache = buffcache, free = free, swapfree = swapfree, swaptotal = swaptotal, swapused = swapused, total = total, used = used)
  
    __obj.asInstanceOf[MemData]
  }
}

