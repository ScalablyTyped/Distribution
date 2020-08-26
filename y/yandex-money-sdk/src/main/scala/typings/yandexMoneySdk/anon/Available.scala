package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Available extends js.Object {
  var available: Double = js.native
  var blocked: js.UndefOr[Double] = js.native
  var debt: js.UndefOr[Double] = js.native
  var deposition_pending: js.UndefOr[Double] = js.native
  var hold: js.UndefOr[Double] = js.native
  var total: Double = js.native
}

object Available {
  @scala.inline
  def apply(available: Double, total: Double): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  @scala.inline
  implicit class AvailableOps[Self <: Available] (val x: Self) extends AnyVal {
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
    def setAvailable(value: Double): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlocked(value: Double): Self = this.set("blocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlocked: Self = this.set("blocked", js.undefined)
    @scala.inline
    def setDebt(value: Double): Self = this.set("debt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebt: Self = this.set("debt", js.undefined)
    @scala.inline
    def setDeposition_pending(value: Double): Self = this.set("deposition_pending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeposition_pending: Self = this.set("deposition_pending", js.undefined)
    @scala.inline
    def setHold(value: Double): Self = this.set("hold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHold: Self = this.set("hold", js.undefined)
  }
  
}

