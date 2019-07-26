package typings
package stripeLib.stripeMod.paymentMethodsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalletData extends js.Object {
  /**
    * Owner's verified billing address. Values are verified or provided by the wallet directly (if supported) at the time of authorization or settlement. They cannot be set or mutated.
    */
  var billing_address: WalletAddress
  /**
    * Owner's verified email. Values are verified or provided by the wallet directly (if supported) at the time of authorization or settlement. They cannot be set or mutated.
    */
  var email: java.lang.String
  /**
    * Owner's verified full name. Values are verified or provided by the wallet directly (if supported) at the time of authorization or settlement. They cannot be set or mutated.
    */
  var name: java.lang.String
  /**
    * Owner's verified shipping address. Values are verified or provided by the wallet directly (if supported) at the time of authorization or settlement. They cannot be set or mutated.
    */
  var shipping_address: WalletAddress
}

object WalletData {
  @scala.inline
  def apply(
    billing_address: WalletAddress,
    email: java.lang.String,
    name: java.lang.String,
    shipping_address: WalletAddress
  ): WalletData = {
    val __obj = js.Dynamic.literal(billing_address = billing_address, email = email, name = name, shipping_address = shipping_address)
  
    __obj.asInstanceOf[WalletData]
  }
}

