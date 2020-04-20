package typings.stripe.mod.issuing.authorizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.apple_pay
  - typings.stripe.stripeStrings.google_pay
  - typings.stripe.stripeStrings.samsung_pay
*/
trait WalletProvider extends js.Object

object WalletProvider {
  @scala.inline
  def apple_pay: typings.stripe.stripeStrings.apple_pay = "apple_pay".asInstanceOf[typings.stripe.stripeStrings.apple_pay]
  @scala.inline
  def google_pay: typings.stripe.stripeStrings.google_pay = "google_pay".asInstanceOf[typings.stripe.stripeStrings.google_pay]
  @scala.inline
  def samsung_pay: typings.stripe.stripeStrings.samsung_pay = "samsung_pay".asInstanceOf[typings.stripe.stripeStrings.samsung_pay]
}

