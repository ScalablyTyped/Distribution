package typings.xummApi.anon

import typings.xummApi.mod.XummTransactionApprovalType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  var account: String | Null = js.native
  var approved_with: js.UndefOr[XummTransactionApprovalType] = js.native
  var dispatched_nodetype: String | Null = js.native
  var dispatched_result: String | Null = js.native
  var dispatched_to: String | Null = js.native
  var hex: String | Null = js.native
  var multisign_account: String | Null = js.native
  var resolved_at: String | Null = js.native
  var txid: String | Null = js.native
}

object Account {
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountNull: Self = this.set("account", null)
    @scala.inline
    def setApproved_with(value: XummTransactionApprovalType): Self = this.set("approved_with", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproved_with: Self = this.set("approved_with", js.undefined)
    @scala.inline
    def setDispatched_nodetype(value: String): Self = this.set("dispatched_nodetype", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispatched_nodetypeNull: Self = this.set("dispatched_nodetype", null)
    @scala.inline
    def setDispatched_result(value: String): Self = this.set("dispatched_result", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispatched_resultNull: Self = this.set("dispatched_result", null)
    @scala.inline
    def setDispatched_to(value: String): Self = this.set("dispatched_to", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispatched_toNull: Self = this.set("dispatched_to", null)
    @scala.inline
    def setHex(value: String): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHexNull: Self = this.set("hex", null)
    @scala.inline
    def setMultisign_account(value: String): Self = this.set("multisign_account", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultisign_accountNull: Self = this.set("multisign_account", null)
    @scala.inline
    def setResolved_at(value: String): Self = this.set("resolved_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolved_atNull: Self = this.set("resolved_at", null)
    @scala.inline
    def setTxid(value: String): Self = this.set("txid", value.asInstanceOf[js.Any])
    @scala.inline
    def setTxidNull: Self = this.set("txid", null)
  }
  
}

