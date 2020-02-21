package typings.xummApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccount extends js.Object {
  var account: String | Null
  var dispatched_result: String | Null
  var dispatched_to: String | Null
  var hex: String | Null
  var multisign_account: String | Null
  var resolved_at: String | Null
  var txid: String | Null
}

object AnonAccount {
  @scala.inline
  def apply(
    account: String = null,
    dispatched_result: String = null,
    dispatched_to: String = null,
    hex: String = null,
    multisign_account: String = null,
    resolved_at: String = null,
    txid: String = null
  ): AnonAccount = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (dispatched_result != null) __obj.updateDynamic("dispatched_result")(dispatched_result.asInstanceOf[js.Any])
    if (dispatched_to != null) __obj.updateDynamic("dispatched_to")(dispatched_to.asInstanceOf[js.Any])
    if (hex != null) __obj.updateDynamic("hex")(hex.asInstanceOf[js.Any])
    if (multisign_account != null) __obj.updateDynamic("multisign_account")(multisign_account.asInstanceOf[js.Any])
    if (resolved_at != null) __obj.updateDynamic("resolved_at")(resolved_at.asInstanceOf[js.Any])
    if (txid != null) __obj.updateDynamic("txid")(txid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccount]
  }
}

