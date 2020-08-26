package typings.stripe.mod.refunds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRefundCreationOptionsWithCharge extends IRefundCreationOptions {
  /**
    * The identifier of the charge to refund.
    */
  var charge: String = js.native
}

object IRefundCreationOptionsWithCharge {
  @scala.inline
  def apply(charge: String): IRefundCreationOptionsWithCharge = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRefundCreationOptionsWithCharge]
  }
  @scala.inline
  implicit class IRefundCreationOptionsWithChargeOps[Self <: IRefundCreationOptionsWithCharge] (val x: Self) extends AnyVal {
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
    def setCharge(value: String): Self = this.set("charge", value.asInstanceOf[js.Any])
  }
  
}

