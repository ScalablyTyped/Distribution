package typings
package winrtLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICivicAddress extends js.Object {
  var city: java.lang.String
  var country: java.lang.String
  var postalCode: java.lang.String
  var state: java.lang.String
  var timestamp: stdLib.Date
}

object ICivicAddress {
  @scala.inline
  def apply(
    city: java.lang.String,
    country: java.lang.String,
    postalCode: java.lang.String,
    state: java.lang.String,
    timestamp: stdLib.Date
  ): ICivicAddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("postalCode")(postalCode)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[ICivicAddress]
  }
}

