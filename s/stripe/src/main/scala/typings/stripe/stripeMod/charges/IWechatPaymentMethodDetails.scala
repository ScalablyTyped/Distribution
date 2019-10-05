package typings.stripe.stripeMod.charges

import typings.stripe.stripeStrings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWechatPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: wechat
}

object IWechatPaymentMethodDetails {
  @scala.inline
  def apply(`type`: wechat): IWechatPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IWechatPaymentMethodDetails]
  }
}

