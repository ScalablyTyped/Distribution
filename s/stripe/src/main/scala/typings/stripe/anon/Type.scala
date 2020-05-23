package typings.stripe.anon

import typings.stripe.mod.customerTaxIds.TaxIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /**
    * Type of the tax ID, one of au_abn, eu_vat, in_gst, no_vat, or nz_gst.
    */
  var `type`: TaxIdType
  /**
    * Value of the tax ID.
    */
  var value: String
}

object Type {
  @scala.inline
  def apply(`type`: TaxIdType, value: String): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

