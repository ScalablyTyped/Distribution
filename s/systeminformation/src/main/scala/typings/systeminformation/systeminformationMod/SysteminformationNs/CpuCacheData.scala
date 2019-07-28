package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuCacheData extends js.Object {
  var l1d: Double
  var l1i: Double
  var l2: Double
  var l3: Double
}

object CpuCacheData {
  @scala.inline
  def apply(l1d: Double, l1i: Double, l2: Double, l3: Double): CpuCacheData = {
    val __obj = js.Dynamic.literal(l1d = l1d, l1i = l1i, l2 = l2, l3 = l3)
  
    __obj.asInstanceOf[CpuCacheData]
  }
}

