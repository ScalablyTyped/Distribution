package typings.stripe.stripeMod.customerTaxIds

import typings.stripe.stripeStrings.string
import typings.stripe.stripeStrings.tax_id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITaxId extends js.Object {
  /**
    * Two-letter ISO code representing the country of the tax ID.
    */
  var country: string
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * ID of the customer.
    */
  var customer: String
  /**
    * Unique identifier for the object.
    */
  var id: String
  /**
    * Has the value true if the object exists in live mode or the value false if the
    * object exists in test mode.
    */
  var livemode: Boolean
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  var `object`: tax_id
  /**
    * Type of the tax ID, one of au_abn, eu_vat, in_gst, no_vat, nz_gst, or unknown.
    */
  var `type`: TaxIdType
  /**
    * Value of the tax ID.
    */
  var value: String
  /**
    * Tax ID verification information.
    */
  var verification: ITaxIdVerification
}

object ITaxId {
  @scala.inline
  def apply(
    country: string,
    created: Double,
    customer: String,
    id: String,
    livemode: Boolean,
    `object`: tax_id,
    `type`: TaxIdType,
    value: String,
    verification: ITaxIdVerification
  ): ITaxId = {
    val __obj = js.Dynamic.literal(country = country, created = created, customer = customer, id = id, livemode = livemode, value = value, verification = verification)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ITaxId]
  }
}

