package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessPaymentOptions extends js.Object {
  var csc: js.UndefOr[String] = js.native
  var ext_auth_fail_uri: js.UndefOr[String] = js.native
  var ext_auth_success_uri: js.UndefOr[String] = js.native
  var money_source: js.UndefOr[String] = js.native
  var request_id: String = js.native
  var test_card: js.UndefOr[String] = js.native
  var test_payment: js.UndefOr[Boolean] = js.native
  var test_result: js.UndefOr[String] = js.native
}

object ProcessPaymentOptions {
  @scala.inline
  def apply(request_id: String): ProcessPaymentOptions = {
    val __obj = js.Dynamic.literal(request_id = request_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessPaymentOptions]
  }
  @scala.inline
  implicit class ProcessPaymentOptionsOps[Self <: ProcessPaymentOptions] (val x: Self) extends AnyVal {
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
    def setRequest_id(value: String): Self = this.set("request_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCsc(value: String): Self = this.set("csc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsc: Self = this.set("csc", js.undefined)
    @scala.inline
    def setExt_auth_fail_uri(value: String): Self = this.set("ext_auth_fail_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt_auth_fail_uri: Self = this.set("ext_auth_fail_uri", js.undefined)
    @scala.inline
    def setExt_auth_success_uri(value: String): Self = this.set("ext_auth_success_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt_auth_success_uri: Self = this.set("ext_auth_success_uri", js.undefined)
    @scala.inline
    def setMoney_source(value: String): Self = this.set("money_source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoney_source: Self = this.set("money_source", js.undefined)
    @scala.inline
    def setTest_card(value: String): Self = this.set("test_card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest_card: Self = this.set("test_card", js.undefined)
    @scala.inline
    def setTest_payment(value: Boolean): Self = this.set("test_payment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest_payment: Self = this.set("test_payment", js.undefined)
    @scala.inline
    def setTest_result(value: String): Self = this.set("test_result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest_result: Self = this.set("test_result", js.undefined)
  }
  
}

