package typings.stripe.anon

import typings.stripe.stripeStrings.alipay_account
import typings.stripe.stripeStrings.all
import typings.stripe.stripeStrings.bitcoin_receiver
import typings.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  /**
    * Return charges that match this source type string. Available options are
    * "all", "alipay_account", "bitcoin_receiver", or "card".
    */
  var `object`: all | alipay_account | bitcoin_receiver | card = js.native
}

object Object {
  @scala.inline
  def apply(`object`: all | alipay_account | bitcoin_receiver | card): Object = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  implicit class ObjectOps[Self <: Object] (val x: Self) extends AnyVal {
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
    def setObject(value: all | alipay_account | bitcoin_receiver | card): Self = this.set("object", value.asInstanceOf[js.Any])
  }
  
}

