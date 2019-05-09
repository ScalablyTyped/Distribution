package typings
package stripeLib.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShippingInformation extends js.Object {
  /**
    * Shipping address.
    */
  var address: IAddress
  /**
    * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
    */
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Recipient name.
    */
  var name: java.lang.String
  /**
    * Recipient phone (including extension).
    */
  var phone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tracking number for a physical product, obtained from the delivery service. If multiple
    * tracking numbers were generated for this purchase, please separate them with commas.
    */
  var tracking_number: js.UndefOr[java.lang.String] = js.undefined
}

object IShippingInformation {
  @scala.inline
  def apply(
    address: IAddress,
    name: java.lang.String,
    carrier: java.lang.String = null,
    phone: java.lang.String = null,
    tracking_number: java.lang.String = null
  ): IShippingInformation = {
    val __obj = js.Dynamic.literal(address = address, name = name)
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (tracking_number != null) __obj.updateDynamic("tracking_number")(tracking_number)
    __obj.asInstanceOf[IShippingInformation]
  }
}

