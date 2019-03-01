package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuCacheData extends js.Object {
  var l1d: scala.Double
  var l1i: scala.Double
  var l2: scala.Double
  var l3: scala.Double
}

object CpuCacheData {
  @scala.inline
  def apply(l1d: scala.Double, l1i: scala.Double, l2: scala.Double, l3: scala.Double): CpuCacheData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("l1d")(l1d)
    __obj.updateDynamic("l1i")(l1i)
    __obj.updateDynamic("l2")(l2)
    __obj.updateDynamic("l3")(l3)
    __obj.asInstanceOf[CpuCacheData]
  }
}

