package typings
package stripejsLib.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CanMakePaymentResult extends js.Object {
  /**
       * true if the browser payment API supports Apple Pay.
       * NOTE: using the paymentRequestButton Element is automatically cross-browser.
       * If you use this PaymentRequest object to create a paymentRequestButton Element, you don‘t need to check applePay yourself
       */
  val applePay: scala.Boolean
}

