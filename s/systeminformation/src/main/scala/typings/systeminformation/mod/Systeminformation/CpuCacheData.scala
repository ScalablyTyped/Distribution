package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpuCacheData extends js.Object {
  var l1d: Double = js.native
  var l1i: Double = js.native
  var l2: Double = js.native
  var l3: Double = js.native
}

object CpuCacheData {
  @scala.inline
  def apply(l1d: Double, l1i: Double, l2: Double, l3: Double): CpuCacheData = {
    val __obj = js.Dynamic.literal(l1d = l1d.asInstanceOf[js.Any], l1i = l1i.asInstanceOf[js.Any], l2 = l2.asInstanceOf[js.Any], l3 = l3.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuCacheData]
  }
  @scala.inline
  implicit class CpuCacheDataOps[Self <: CpuCacheData] (val x: Self) extends AnyVal {
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
    def setL1d(value: Double): Self = this.set("l1d", value.asInstanceOf[js.Any])
    @scala.inline
    def setL1i(value: Double): Self = this.set("l1i", value.asInstanceOf[js.Any])
    @scala.inline
    def setL2(value: Double): Self = this.set("l2", value.asInstanceOf[js.Any])
    @scala.inline
    def setL3(value: Double): Self = this.set("l3", value.asInstanceOf[js.Any])
  }
  
}

