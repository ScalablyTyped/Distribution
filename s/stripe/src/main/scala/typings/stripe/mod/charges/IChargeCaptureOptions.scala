package typings.stripe.mod.charges

import typings.stripe.mod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChargeCaptureOptions extends IDataOptions {
  /**
    * A positive integer in the smallest currency unit (e.g 100 cents to charge
    * $1.00, or 1 to charge ¥1, a 0-decimal currency) representing how much to
    * charge the card. The minimum amount is £0.50 (or equivalent in charge
    * currency).
    */
  var amount: js.UndefOr[Double] = js.native
}

object IChargeCaptureOptions {
  @scala.inline
  def apply(): IChargeCaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChargeCaptureOptions]
  }
  @scala.inline
  implicit class IChargeCaptureOptionsOps[Self <: IChargeCaptureOptions] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
  }
  
}

