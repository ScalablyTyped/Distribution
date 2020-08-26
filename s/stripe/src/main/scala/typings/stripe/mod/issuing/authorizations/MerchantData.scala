package typings.stripe.mod.issuing.authorizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantData extends js.Object {
  /**
    * A categorization of the seller’s type of business. See our merchant categories guide for a list of possible values.
    */
  var category: String = js.native
  /**
    * City where the seller is located
    */
  var city: String = js.native
  /**
    * Country where the seller is located
    */
  var country: String = js.native
  /**
    * Name of the seller
    */
  var name: String = js.native
  /**
    * Identifier assigned to the seller by the card brand
    */
  var network_id: String = js.native
  /**
    * Postal code where the seller is located
    */
  var postal_code: String = js.native
  /**
    * State where the seller is located
    */
  var state: String = js.native
  /**
    * The url an online purchase was made from
    */
  var url: String = js.native
}

object MerchantData {
  @scala.inline
  def apply(
    category: String,
    city: String,
    country: String,
    name: String,
    network_id: String,
    postal_code: String,
    state: String,
    url: String
  ): MerchantData = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], network_id = network_id.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantData]
  }
  @scala.inline
  implicit class MerchantDataOps[Self <: MerchantData] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetwork_id(value: String): Self = this.set("network_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostal_code(value: String): Self = this.set("postal_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

