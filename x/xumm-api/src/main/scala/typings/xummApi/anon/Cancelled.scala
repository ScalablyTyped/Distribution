package typings.xummApi.anon

import typings.xummApi.mod.XummCancelReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancelled extends js.Object {
  var cancelled: Boolean = js.native
  var reason: XummCancelReason = js.native
}

object Cancelled {
  @scala.inline
  def apply(cancelled: Boolean, reason: XummCancelReason): Cancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelled]
  }
  @scala.inline
  implicit class CancelledOps[Self <: Cancelled] (val x: Self) extends AnyVal {
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
    def setCancelled(value: Boolean): Self = this.set("cancelled", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: XummCancelReason): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

