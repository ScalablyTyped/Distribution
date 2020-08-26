package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingDetails extends js.Object {
  /** Shipping address. */
  var address: ShippingDetailsAddress = js.native
  /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
  var carrier: js.UndefOr[String] = js.native
  /** Recipient name. */
  var name: String = js.native
  /** Recipient phone (including extension). */
  var phone: js.UndefOr[String] = js.native
  /**
    * The tracking number for a physical product, obtained from the delivery service.
    * If multiple tracking numbers were generated for this purchase, please separate them with commas.
    */
  var tracking_number: js.UndefOr[String] = js.native
}

object ShippingDetails {
  @scala.inline
  def apply(address: ShippingDetailsAddress, name: String): ShippingDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingDetails]
  }
  @scala.inline
  implicit class ShippingDetailsOps[Self <: ShippingDetails] (val x: Self) extends AnyVal {
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
    def setAddress(value: ShippingDetailsAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCarrier(value: String): Self = this.set("carrier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setTracking_number(value: String): Self = this.set("tracking_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracking_number: Self = this.set("tracking_number", js.undefined)
  }
  
}

