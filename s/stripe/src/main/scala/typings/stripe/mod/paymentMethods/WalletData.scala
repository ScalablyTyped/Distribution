package typings.stripe.mod.paymentMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalletData extends js.Object {
  /**
    * Owner's verified billing address. Values are verified or provided by the wallet directly (if supported) at the time of authorization or settlement. They cannot be set or mutated.
    */
  var billing_address: WalletAddress = js.native
  /**
    * Owner's verified email. Values are verified or provided by the wallet directly (if supported) at the time of authorization or settlement. They cannot be set or mutated.
    */
  var email: String = js.native
  /**
    * Owner's verified full name. Values are verified or provided by the wallet directly (if supported) at the time of authorization or settlement. They cannot be set or mutated.
    */
  var name: String = js.native
  /**
    * Owner's verified shipping address. Values are verified or provided by the wallet directly (if supported) at the time of authorization or settlement. They cannot be set or mutated.
    */
  var shipping_address: WalletAddress = js.native
}

object WalletData {
  @scala.inline
  def apply(billing_address: WalletAddress, email: String, name: String, shipping_address: WalletAddress): WalletData = {
    val __obj = js.Dynamic.literal(billing_address = billing_address.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shipping_address = shipping_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletData]
  }
  @scala.inline
  implicit class WalletDataOps[Self <: WalletData] (val x: Self) extends AnyVal {
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
    def setBilling_address(value: WalletAddress): Self = this.set("billing_address", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setShipping_address(value: WalletAddress): Self = this.set("shipping_address", value.asInstanceOf[js.Any])
  }
  
}

