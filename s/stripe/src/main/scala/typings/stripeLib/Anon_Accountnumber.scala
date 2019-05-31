package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accountnumber extends js.Object {
  var account_number: java.lang.String
  var bank_name: java.lang.String
  var fingerprint: java.lang.String
  var refund_account_holder_name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var refund_account_holder_type: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var refund_routing_number: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var routing_number: java.lang.String
  var swift_code: java.lang.String
}

object Anon_Accountnumber {
  @scala.inline
  def apply(
    account_number: java.lang.String,
    bank_name: java.lang.String,
    fingerprint: java.lang.String,
    routing_number: java.lang.String,
    swift_code: java.lang.String,
    refund_account_holder_name: java.lang.String = null,
    refund_account_holder_type: java.lang.String = null,
    refund_routing_number: java.lang.String = null
  ): Anon_Accountnumber = {
    val __obj = js.Dynamic.literal(account_number = account_number, bank_name = bank_name, fingerprint = fingerprint, routing_number = routing_number, swift_code = swift_code)
    if (refund_account_holder_name != null) __obj.updateDynamic("refund_account_holder_name")(refund_account_holder_name)
    if (refund_account_holder_type != null) __obj.updateDynamic("refund_account_holder_type")(refund_account_holder_type)
    if (refund_routing_number != null) __obj.updateDynamic("refund_routing_number")(refund_routing_number)
    __obj.asInstanceOf[Anon_Accountnumber]
  }
}

