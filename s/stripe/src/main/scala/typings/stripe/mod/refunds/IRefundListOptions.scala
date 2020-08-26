package typings.stripe.mod.refunds

import typings.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRefundListOptions extends IListOptions {
  /**
    * Only return refunds for the charge specified by this charge ID.
    */
  var charge: js.UndefOr[String] = js.native
}

object IRefundListOptions {
  @scala.inline
  def apply(): IRefundListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRefundListOptions]
  }
  @scala.inline
  implicit class IRefundListOptionsOps[Self <: IRefundListOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteCharge: Self = this.set("charge", js.undefined)
  }
  
}

