package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemData extends js.Object {
  var active: Double
  var available: Double
  var buffcache: Double
  var buffers: Double
  var cached: Double
  var free: Double
  var slab: Double
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
    buffers: Double,
    cached: Double,
    free: Double,
    slab: Double,
    swapfree: Double,
    swaptotal: Double,
    swapused: Double,
    total: Double,
    used: Double
  ): MemData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], buffcache = buffcache.asInstanceOf[js.Any], buffers = buffers.asInstanceOf[js.Any], cached = cached.asInstanceOf[js.Any], free = free.asInstanceOf[js.Any], slab = slab.asInstanceOf[js.Any], swapfree = swapfree.asInstanceOf[js.Any], swaptotal = swaptotal.asInstanceOf[js.Any], swapused = swapused.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemData]
  }
}

