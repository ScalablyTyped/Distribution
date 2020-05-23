package typings.xummApi.anon

import typings.xummApi.mod.XummTransactionApprovalType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var account: String | Null
  var approved_with: js.UndefOr[XummTransactionApprovalType] = js.undefined
  var dispatched_result: String | Null
  var dispatched_to: String | Null
  var hex: String | Null
  var multisign_account: String | Null
  var resolved_at: String | Null
  var txid: String | Null
}

object Account {
  @scala.inline
  def apply(
    account: String = null,
    approved_with: XummTransactionApprovalType = null,
    dispatched_result: String = null,
    dispatched_to: String = null,
    hex: String = null,
    multisign_account: String = null,
    resolved_at: String = null,
    txid: String = null
  ): Account = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], dispatched_result = dispatched_result.asInstanceOf[js.Any], dispatched_to = dispatched_to.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], multisign_account = multisign_account.asInstanceOf[js.Any], resolved_at = resolved_at.asInstanceOf[js.Any], txid = txid.asInstanceOf[js.Any])
    if (approved_with != null) __obj.updateDynamic("approved_with")(approved_with.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}

