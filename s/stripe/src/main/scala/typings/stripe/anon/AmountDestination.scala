package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmountDestination extends js.Object {
  /**
    * The amount transferred to the destination account, if specified.
    * By default, the entire charge amount is transferred to the destination account.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * ID of an existing, connected Stripe account.
    */
  var destination: String = js.native
}

object AmountDestination {
  @scala.inline
  def apply(destination: String): AmountDestination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountDestination]
  }
  @scala.inline
  implicit class AmountDestinationOps[Self <: AmountDestination] (val x: Self) extends AnyVal {
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
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
  }
  
}

