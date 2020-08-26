package typings.stripejs.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenData extends js.Object {
  var address_city: String = js.native
  /**
    * A two character country code identifying the country
    * @example 'US'
    */
  var address_country: js.UndefOr[String] = js.native
  /**
    * Fields for billing address information.
    */
  var address_line1: String = js.native
  var address_line2: js.UndefOr[String] = js.native
  var address_state: String = js.native
  var address_zip: String = js.native
  /**
    * The amount paid, not a decimal. In USD this is in cents.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * Used to add a card to an account
    * NOTE: Currently, the only supported currency for debit card payouts is 'usd'
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The Cardholder name
    */
  var name: String = js.native
}

object TokenData {
  @scala.inline
  def apply(
    address_city: String,
    address_line1: String,
    address_state: String,
    address_zip: String,
    name: String
  ): TokenData = {
    val __obj = js.Dynamic.literal(address_city = address_city.asInstanceOf[js.Any], address_line1 = address_line1.asInstanceOf[js.Any], address_state = address_state.asInstanceOf[js.Any], address_zip = address_zip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenData]
  }
  @scala.inline
  implicit class TokenDataOps[Self <: TokenData] (val x: Self) extends AnyVal {
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
    def setAddress_city(value: String): Self = this.set("address_city", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress_line1(value: String): Self = this.set("address_line1", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress_state(value: String): Self = this.set("address_state", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress_zip(value: String): Self = this.set("address_zip", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress_country(value: String): Self = this.set("address_country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress_country: Self = this.set("address_country", js.undefined)
    @scala.inline
    def setAddress_line2(value: String): Self = this.set("address_line2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress_line2: Self = this.set("address_line2", js.undefined)
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
  }
  
}

