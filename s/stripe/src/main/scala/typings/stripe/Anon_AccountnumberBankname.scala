package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountnumberBankname extends js.Object {
  var account_number: String
  var bank_name: String
  var fingerprint: String
  var refund_account_holder_name: js.UndefOr[String | Null] = js.undefined
  var refund_account_holder_type: js.UndefOr[String | Null] = js.undefined
  var refund_routing_number: js.UndefOr[String | Null] = js.undefined
  var routing_number: String
  var swift_code: String
}

object Anon_AccountnumberBankname {
  @scala.inline
  def apply(
    account_number: String,
    bank_name: String,
    fingerprint: String,
    routing_number: String,
    swift_code: String,
    refund_account_holder_name: String = null,
    refund_account_holder_type: String = null,
    refund_routing_number: String = null
  ): Anon_AccountnumberBankname = {
    val __obj = js.Dynamic.literal(account_number = account_number, bank_name = bank_name, fingerprint = fingerprint, routing_number = routing_number, swift_code = swift_code)
    if (refund_account_holder_name != null) __obj.updateDynamic("refund_account_holder_name")(refund_account_holder_name)
    if (refund_account_holder_type != null) __obj.updateDynamic("refund_account_holder_type")(refund_account_holder_type)
    if (refund_routing_number != null) __obj.updateDynamic("refund_routing_number")(refund_routing_number)
    __obj.asInstanceOf[Anon_AccountnumberBankname]
  }
}

