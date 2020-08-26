package typings.stripe.mod.topups

import typings.stripe.mod.IListOptionsCreated
import typings.stripe.stripeStrings.canceled
import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITopupsListOptions extends IListOptionsCreated {
  /**
    * A filter on the list based on the object amount field. The value can be a string with
    * an integer amount, or it can be a dictionary.
    */
  var amount: js.UndefOr[IAmountFilter] = js.native
  /**
    * Only return top-ups that have the given status.
    */
  var status: js.UndefOr[canceled | failed | pending | succeeded] = js.native
}

object ITopupsListOptions {
  @scala.inline
  def apply(): ITopupsListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITopupsListOptions]
  }
  @scala.inline
  implicit class ITopupsListOptionsOps[Self <: ITopupsListOptions] (val x: Self) extends AnyVal {
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
    def setAmount(value: IAmountFilter): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setStatus(value: canceled | failed | pending | succeeded): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

