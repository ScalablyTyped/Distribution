package typings
package stripeLib.stripeMod.paymentMethodsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardChecks extends js.Object {
  /**
    * If a address line1 was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var address_line1_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked | scala.Null
  /**
    * If a address postal code was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var address_postal_code_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked | scala.Null
  /**
    * If a CVC was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var cvc_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked | scala.Null
}

object CardChecks {
  @scala.inline
  def apply(
    address_line1_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked = null,
    address_postal_code_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked = null,
    cvc_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked = null
  ): CardChecks = {
    val __obj = js.Dynamic.literal()
    if (address_line1_check != null) __obj.updateDynamic("address_line1_check")(address_line1_check.asInstanceOf[js.Any])
    if (address_postal_code_check != null) __obj.updateDynamic("address_postal_code_check")(address_postal_code_check.asInstanceOf[js.Any])
    if (cvc_check != null) __obj.updateDynamic("cvc_check")(cvc_check.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardChecks]
  }
}

