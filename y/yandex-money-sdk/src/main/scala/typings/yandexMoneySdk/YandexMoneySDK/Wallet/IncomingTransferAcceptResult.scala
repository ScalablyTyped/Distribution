package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingTransferAcceptResult extends js.Object {
  var error: js.UndefOr[String] = js.native
  var ext_action_uri: js.UndefOr[String] = js.native
  var protection_code_attempts_available: js.UndefOr[Double] = js.native
  var status: String = js.native
}

object IncomingTransferAcceptResult {
  @scala.inline
  def apply(status: String): IncomingTransferAcceptResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingTransferAcceptResult]
  }
  @scala.inline
  implicit class IncomingTransferAcceptResultOps[Self <: IncomingTransferAcceptResult] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExt_action_uri(value: String): Self = this.set("ext_action_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt_action_uri: Self = this.set("ext_action_uri", js.undefined)
    @scala.inline
    def setProtection_code_attempts_available(value: Double): Self = this.set("protection_code_attempts_available", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtection_code_attempts_available: Self = this.set("protection_code_attempts_available", js.undefined)
  }
  
}

