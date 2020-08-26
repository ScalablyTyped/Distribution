package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import typings.yandexMoneySdk.anon.Article
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationDetailsResult extends js.Object {
  var amount: js.UndefOr[Double] = js.native
  var amount_due: js.UndefOr[Double] = js.native
  var answer_datetime: js.UndefOr[String] = js.native
  var codepro: js.UndefOr[Boolean] = js.native
  var comment: js.UndefOr[String] = js.native
  var datetime: js.UndefOr[String] = js.native
  var details: js.UndefOr[String] = js.native
  var digital_goods: js.UndefOr[Article] = js.native
  var direction: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var expires: js.UndefOr[String] = js.native
  var fee: js.UndefOr[Double] = js.native
  var label: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var operation_id: js.UndefOr[String] = js.native
  var pattern_id: js.UndefOr[String] = js.native
  var protection_code: js.UndefOr[String] = js.native
  var recipient: js.UndefOr[String] = js.native
  var recipient_type: js.UndefOr[String] = js.native
  var sender: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object OperationDetailsResult {
  @scala.inline
  def apply(): OperationDetailsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationDetailsResult]
  }
  @scala.inline
  implicit class OperationDetailsResultOps[Self <: OperationDetailsResult] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setAmount_due(value: Double): Self = this.set("amount_due", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount_due: Self = this.set("amount_due", js.undefined)
    @scala.inline
    def setAnswer_datetime(value: String): Self = this.set("answer_datetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswer_datetime: Self = this.set("answer_datetime", js.undefined)
    @scala.inline
    def setCodepro(value: Boolean): Self = this.set("codepro", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodepro: Self = this.set("codepro", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setDatetime(value: String): Self = this.set("datetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatetime: Self = this.set("datetime", js.undefined)
    @scala.inline
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setDigital_goods(value: Article): Self = this.set("digital_goods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigital_goods: Self = this.set("digital_goods", js.undefined)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExpires(value: String): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setFee(value: Double): Self = this.set("fee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFee: Self = this.set("fee", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOperation_id(value: String): Self = this.set("operation_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation_id: Self = this.set("operation_id", js.undefined)
    @scala.inline
    def setPattern_id(value: String): Self = this.set("pattern_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern_id: Self = this.set("pattern_id", js.undefined)
    @scala.inline
    def setProtection_code(value: String): Self = this.set("protection_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtection_code: Self = this.set("protection_code", js.undefined)
    @scala.inline
    def setRecipient(value: String): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
    @scala.inline
    def setRecipient_type(value: String): Self = this.set("recipient_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipient_type: Self = this.set("recipient_type", js.undefined)
    @scala.inline
    def setSender(value: String): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

