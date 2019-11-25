package typings.stripe.stripeMod.customerTaxIds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITaxIdCreationOptions extends js.Object {
  /**
    * Type of the tax ID, one of au_abn, eu_vat, in_gst, no_vat, or nz_gst
    */
  var `type`: TaxIdType
  /**
    * Value of the tax ID.
    */
  var value: String
}

object ITaxIdCreationOptions {
  @scala.inline
  def apply(`type`: TaxIdType, value: String): ITaxIdCreationOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaxIdCreationOptions]
  }
}

