package typings.stripe.mod.subscriptions

import typings.stripe.mod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionCancellationOptions extends IDataOptions {
  /**
    * @deprecated Use subscription update with cancel_at_period_end option as of 2018-08-23.
    *
    * A flag that if set to true will delay the cancellation of the subscription until the end of the current period.
    */
  var at_period_end: js.UndefOr[Boolean] = js.native
  /**
    * Will generate a final invoice that invoices for any un-invoiced metered usage and new/pending proration invoice items.
    */
  var invoice_now: js.UndefOr[Boolean] = js.native
  /**
    * Will generate a proration invoice item that credits remaining unused time until the subscription period end.
    */
  var prorate: js.UndefOr[Boolean] = js.native
}

object ISubscriptionCancellationOptions {
  @scala.inline
  def apply(): ISubscriptionCancellationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscriptionCancellationOptions]
  }
  @scala.inline
  implicit class ISubscriptionCancellationOptionsOps[Self <: ISubscriptionCancellationOptions] (val x: Self) extends AnyVal {
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
    def setAt_period_end(value: Boolean): Self = this.set("at_period_end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAt_period_end: Self = this.set("at_period_end", js.undefined)
    @scala.inline
    def setInvoice_now(value: Boolean): Self = this.set("invoice_now", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice_now: Self = this.set("invoice_now", js.undefined)
    @scala.inline
    def setProrate(value: Boolean): Self = this.set("prorate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProrate: Self = this.set("prorate", js.undefined)
  }
  
}

