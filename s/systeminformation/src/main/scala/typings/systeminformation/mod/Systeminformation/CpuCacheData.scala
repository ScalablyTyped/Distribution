package typings.systeminformation.mod.Systeminformation

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
    val __obj = js.Dynamic.literal(l1d = l1d.asInstanceOf[js.Any], l1i = l1i.asInstanceOf[js.Any], l2 = l2.asInstanceOf[js.Any], l3 = l3.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuCacheData]
  }
}

