package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Addressline1check extends js.Object {
  var address_line1_check: Boolean | Null
  var address_postal_code_check: Boolean | Null
  var cvc_check: Boolean | Null
}

object Addressline1check {
  @scala.inline
  def apply(
    address_line1_check: Boolean = null.asInstanceOf[Boolean],
    address_postal_code_check: Boolean = null.asInstanceOf[Boolean],
    cvc_check: Boolean = null.asInstanceOf[Boolean]
  ): Addressline1check = {
    val __obj = js.Dynamic.literal(address_line1_check = address_line1_check.asInstanceOf[js.Any], address_postal_code_check = address_postal_code_check.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addressline1check]
  }
}

