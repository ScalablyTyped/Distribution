package typings.stripe.mod.paymentMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalletAddress extends js.Object {
  /** City/District/Suburb/Town/Village. */
  var city: String
  /** 2-letter country code. */
  var country: String
  /** Address line 1 (Street address/PO Box/Company name). */
  var line1: String
  /** Address line 2 (Apartment/Suite/Unit/Building). */
  var line2: String
  /** ZIP or postal code. */
  var postal_code: String
  /** State/County/Province/Region. */
  var state: String
}

object WalletAddress {
  @scala.inline
  def apply(city: String, country: String, line1: String, line2: String, postal_code: String, state: String): WalletAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], line2 = line2.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletAddress]
  }
}

