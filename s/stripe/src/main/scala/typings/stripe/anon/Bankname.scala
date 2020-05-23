package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bankname extends js.Object {
  var account_number: String
  var bank_name: String
  var fingerprint: String
  var refund_account_holder_name: js.UndefOr[String | Null] = js.undefined
  var refund_account_holder_type: js.UndefOr[String | Null] = js.undefined
  var refund_routing_number: js.UndefOr[String | Null] = js.undefined
  var routing_number: String
  var swift_code: String
}

object Bankname {
  @scala.inline
  def apply(
    account_number: String,
    bank_name: String,
    fingerprint: String,
    routing_number: String,
    swift_code: String,
    refund_account_holder_name: js.UndefOr[Null | String] = js.undefined,
    refund_account_holder_type: js.UndefOr[Null | String] = js.undefined,
    refund_routing_number: js.UndefOr[Null | String] = js.undefined
  ): Bankname = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], swift_code = swift_code.asInstanceOf[js.Any])
    if (!js.isUndefined(refund_account_holder_name)) __obj.updateDynamic("refund_account_holder_name")(refund_account_holder_name.asInstanceOf[js.Any])
    if (!js.isUndefined(refund_account_holder_type)) __obj.updateDynamic("refund_account_holder_type")(refund_account_holder_type.asInstanceOf[js.Any])
    if (!js.isUndefined(refund_routing_number)) __obj.updateDynamic("refund_routing_number")(refund_routing_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bankname]
  }
}

