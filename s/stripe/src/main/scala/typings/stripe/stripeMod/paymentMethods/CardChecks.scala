package typings.stripe.stripeMod.paymentMethods

import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.pass
import typings.stripe.stripeStrings.unavailable
import typings.stripe.stripeStrings.unchecked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardChecks extends js.Object {
  /**
    * If a address line1 was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var address_line1_check: pass | failed | unavailable | unchecked | Null
  /**
    * If a address postal code was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var address_postal_code_check: pass | failed | unavailable | unchecked | Null
  /**
    * If a CVC was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var cvc_check: pass | failed | unavailable | unchecked | Null
}

object CardChecks {
  @scala.inline
  def apply(
    address_line1_check: pass | failed | unavailable | unchecked = null,
    address_postal_code_check: pass | failed | unavailable | unchecked = null,
    cvc_check: pass | failed | unavailable | unchecked = null
  ): CardChecks = {
    val __obj = js.Dynamic.literal()
    if (address_line1_check != null) __obj.updateDynamic("address_line1_check")(address_line1_check.asInstanceOf[js.Any])
    if (address_postal_code_check != null) __obj.updateDynamic("address_postal_code_check")(address_postal_code_check.asInstanceOf[js.Any])
    if (cvc_check != null) __obj.updateDynamic("cvc_check")(cvc_check.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardChecks]
  }
}

