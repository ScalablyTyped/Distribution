package typings.winrtUwp.Windows.Devices.Geolocation

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Unsupported API. */
trait CivicAddress extends js.Object {
  /** Unsupported API. */
  var city: String
  /** Unsupported API. */
  var country: String
  /** Unsupported API. */
  var postalCode: String
  /** Unsupported API. */
  var state: String
  /** Unsupported API. */
  var timestamp: Date
}

object CivicAddress {
  @scala.inline
  def apply(city: String, country: String, postalCode: String, state: String, timestamp: Date): CivicAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CivicAddress]
  }
}

