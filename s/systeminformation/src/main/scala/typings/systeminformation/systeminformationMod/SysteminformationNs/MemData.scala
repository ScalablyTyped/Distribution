package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemData extends js.Object {
  var active: Double
  var available: Double
  var buffcache: Double
  var free: Double
  var swapfree: Double
  var swaptotal: Double
  var swapused: Double
  var total: Double
  var used: Double
}

object MemData {
  @scala.inline
  def apply(
    active: Double,
    available: Double,
    buffcache: Double,
    free: Double,
    swapfree: Double,
    swaptotal: Double,
    swapused: Double,
    total: Double,
    used: Double
  ): MemData = {
    val __obj = js.Dynamic.literal(active = active, available = available, buffcache = buffcache, free = free, swapfree = swapfree, swaptotal = swaptotal, swapused = swapused, total = total, used = used)
  
    __obj.asInstanceOf[MemData]
  }
}

