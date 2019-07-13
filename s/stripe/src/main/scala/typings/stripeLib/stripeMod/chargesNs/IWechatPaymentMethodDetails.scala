package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWechatPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: stripeLib.stripeLibStrings.wechat
}

object IWechatPaymentMethodDetails {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.wechat): IWechatPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IWechatPaymentMethodDetails]
  }
}

