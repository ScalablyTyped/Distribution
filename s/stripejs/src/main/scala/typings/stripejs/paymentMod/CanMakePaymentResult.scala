package typings.stripejs.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanMakePaymentResult extends js.Object {
  /**
    * true if the browser payment API supports Apple Pay.
    * NOTE: using the paymentRequestButton Element is automatically cross-browser.
    * If you use this PaymentRequest object to create a paymentRequestButton Element, you don‘t need to check applePay yourself
    */
  val applePay: Boolean
}

object CanMakePaymentResult {
  @scala.inline
  def apply(applePay: Boolean): CanMakePaymentResult = {
    val __obj = js.Dynamic.literal(applePay = applePay.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanMakePaymentResult]
  }
}

