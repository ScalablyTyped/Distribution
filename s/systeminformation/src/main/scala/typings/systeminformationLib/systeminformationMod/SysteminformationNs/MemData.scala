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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("available")(available)
    __obj.updateDynamic("buffcache")(buffcache)
    __obj.updateDynamic("free")(free)
    __obj.updateDynamic("swapfree")(swapfree)
    __obj.updateDynamic("swaptotal")(swaptotal)
    __obj.updateDynamic("swapused")(swapused)
    __obj.updateDynamic("total")(total)
    __obj.updateDynamic("used")(used)
    __obj.asInstanceOf[MemData]
  }
}

