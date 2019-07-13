package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addressline1check extends js.Object {
  /**
    * If a address line1 was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var address_line1_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked
  /**
    * If a address postal code was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var address_postal_code_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked
  /**
    * If a CVC was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var cvc_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked
}

object Anon_Addressline1check {
  @scala.inline
  def apply(
    address_line1_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked,
    address_postal_code_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked,
    cvc_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked
  ): Anon_Addressline1check = {
    val __obj = js.Dynamic.literal(address_line1_check = address_line1_check.asInstanceOf[js.Any], address_postal_code_check = address_postal_code_check.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Addressline1check]
  }
}

