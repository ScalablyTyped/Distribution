package typings.stripe.stripeMod.issuing.authorizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantData extends js.Object {
  /**
    * A categorization of the seller’s type of business. See our merchant categories guide for a list of possible values.
    */
  var category: String
  /**
    * City where the seller is located
    */
  var city: String
  /**
    * Country where the seller is located
    */
  var country: String
  /**
    * Name of the seller
    */
  var name: String
  /**
    * Identifier assigned to the seller by the card brand
    */
  var network_id: String
  /**
    * Postal code where the seller is located
    */
  var postal_code: String
  /**
    * State where the seller is located
    */
  var state: String
  /**
    * The url an online purchase was made from
    */
  var url: String
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
}

