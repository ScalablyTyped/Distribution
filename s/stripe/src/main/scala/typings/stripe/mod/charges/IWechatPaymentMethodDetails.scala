package typings.stripe.mod.charges

import typings.stripe.stripeStrings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWechatPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: wechat = js.native
}

object IWechatPaymentMethodDetails {
  @scala.inline
  def apply(`type`: wechat): IWechatPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWechatPaymentMethodDetails]
  }
  @scala.inline
  implicit class IWechatPaymentMethodDetailsOps[Self <: IWechatPaymentMethodDetails] (val x: Self) extends AnyVal {
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
    def setType(value: wechat): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

