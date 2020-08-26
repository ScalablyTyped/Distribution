package typings.stripe.mod.payouts

import typings.stripe.mod.IDateFilter
import typings.stripe.mod.IListOptionsCreated
import typings.stripe.stripeStrings.canceled
import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.paid
import typings.stripe.stripeStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPayoutListOptions extends IListOptionsCreated {
  var arrival_date: js.UndefOr[String | IDateFilter] = js.native
  var destination: js.UndefOr[String] = js.native
  var status: js.UndefOr[canceled | failed | paid | pending] = js.native
}

object IPayoutListOptions {
  @scala.inline
  def apply(): IPayoutListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPayoutListOptions]
  }
  @scala.inline
  implicit class IPayoutListOptionsOps[Self <: IPayoutListOptions] (val x: Self) extends AnyVal {
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
    def setArrival_date(value: String | IDateFilter): Self = this.set("arrival_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrival_date: Self = this.set("arrival_date", js.undefined)
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setStatus(value: canceled | failed | paid | pending): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

