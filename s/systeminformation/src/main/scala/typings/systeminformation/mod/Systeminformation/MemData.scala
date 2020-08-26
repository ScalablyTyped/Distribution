package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemData extends js.Object {
  var active: Double = js.native
  var available: Double = js.native
  var buffcache: Double = js.native
  var buffers: Double = js.native
  var cached: Double = js.native
  var free: Double = js.native
  var slab: Double = js.native
  var swapfree: Double = js.native
  var swaptotal: Double = js.native
  var swapused: Double = js.native
  var total: Double = js.native
  var used: Double = js.native
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
  @scala.inline
  implicit class MemDataOps[Self <: MemData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Double): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailable(value: Double): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuffcache(value: Double): Self = this.set("buffcache", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuffers(value: Double): Self = this.set("buffers", value.asInstanceOf[js.Any])
    @scala.inline
    def setCached(value: Double): Self = this.set("cached", value.asInstanceOf[js.Any])
    @scala.inline
    def setFree(value: Double): Self = this.set("free", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlab(value: Double): Self = this.set("slab", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwapfree(value: Double): Self = this.set("swapfree", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwaptotal(value: Double): Self = this.set("swaptotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwapused(value: Double): Self = this.set("swapused", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed(value: Double): Self = this.set("used", value.asInstanceOf[js.Any])
  }
  
}

