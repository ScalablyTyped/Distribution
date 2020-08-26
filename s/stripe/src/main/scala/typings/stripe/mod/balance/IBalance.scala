package typings.stripe.mod.balance

import typings.stripe.mod.IObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBalance extends IObject {
  /**
    * Funds that are available to be paid out automatically by Stripe or explicitly
    * via the transfers API. The available balance for each currency and payment
    * type can be found in the source_types property.
    */
  var available: js.Array[ISourceType] = js.native
  var livemode: Boolean = js.native
  /**
    * Funds that are not available in the balance yet, due to the 7-day rolling pay
    * cycle. The pending balance for each currency and payment type can be
    * found in the source_types property
    */
  var pending: js.Array[ISourceType] = js.native
}

object IBalance {
  @scala.inline
  def apply(
    available: js.Array[ISourceType],
    livemode: Boolean,
    `object`: String,
    pending: js.Array[ISourceType]
  ): IBalance = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBalance]
  }
  @scala.inline
  implicit class IBalanceOps[Self <: IBalance] (val x: Self) extends AnyVal {
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
    def setAvailableVarargs(value: ISourceType*): Self = this.set("available", js.Array(value :_*))
    @scala.inline
    def setAvailable(value: js.Array[ISourceType]): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPendingVarargs(value: ISourceType*): Self = this.set("pending", js.Array(value :_*))
    @scala.inline
    def setPending(value: js.Array[ISourceType]): Self = this.set("pending", value.asInstanceOf[js.Any])
  }
  
}

