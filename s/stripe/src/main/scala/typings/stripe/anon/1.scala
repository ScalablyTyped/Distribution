package typings.stripe.anon

import typings.stripe.mod.setupIntents.SetupIntentCancelationReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1` extends js.Object {
  var cancellation_reason: js.UndefOr[SetupIntentCancelationReason] = js.native
}

object `1` {
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
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
    def setCancellation_reason(value: SetupIntentCancelationReason): Self = this.set("cancellation_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancellation_reason: Self = this.set("cancellation_reason", js.undefined)
  }
  
}

