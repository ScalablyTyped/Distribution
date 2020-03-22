package typings.stripe

import typings.stripe.stripeStrings.alipay_account
import typings.stripe.stripeStrings.all
import typings.stripe.stripeStrings.bitcoin_receiver
import typings.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObject extends js.Object {
  /**
    * Return charges that match this source type string. Available options are
    * "all", "alipay_account", "bitcoin_receiver", or "card".
    */
  var `object`: all | alipay_account | bitcoin_receiver | card
}

object AnonObject {
  @scala.inline
  def apply(`object`: all | alipay_account | bitcoin_receiver | card): AnonObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObject]
  }
}

