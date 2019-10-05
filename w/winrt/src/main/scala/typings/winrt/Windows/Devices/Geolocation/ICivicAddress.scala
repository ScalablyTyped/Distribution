package typings.winrt.Windows.Devices.Geolocation

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICivicAddress extends js.Object {
  var city: String
  var country: String
  var postalCode: String
  var state: String
  var timestamp: Date
}

object ICivicAddress {
  @scala.inline
  def apply(city: String, country: String, postalCode: String, state: String, timestamp: Date): ICivicAddress = {
    val __obj = js.Dynamic.literal(city = city, country = country, postalCode = postalCode, state = state, timestamp = timestamp)
  
    __obj.asInstanceOf[ICivicAddress]
  }
}

