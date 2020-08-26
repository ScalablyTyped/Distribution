package typings.stripe.mod.issuing.cards

import typings.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import typings.stripe.stripeStrings.bulk
import typings.stripe.stripeStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIssuingCardShippingAddress extends js.Object {
  /**
    * Shipping address.
    */
  var address: ICardholderBillingAddress = js.native
  /**
    * Recipient name.
    */
  var name: String = js.native
  /**
    * One of bulk or individual. Bulk shipments will be grouped and mailed together, while individual ones will not.
    */
  var `type`: js.UndefOr[bulk | individual] = js.native
}

object IIssuingCardShippingAddress {
  @scala.inline
  def apply(address: ICardholderBillingAddress, name: String): IIssuingCardShippingAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardShippingAddress]
  }
  @scala.inline
  implicit class IIssuingCardShippingAddressOps[Self <: IIssuingCardShippingAddress] (val x: Self) extends AnyVal {
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
    def setAddress(value: ICardholderBillingAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: bulk | individual): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

