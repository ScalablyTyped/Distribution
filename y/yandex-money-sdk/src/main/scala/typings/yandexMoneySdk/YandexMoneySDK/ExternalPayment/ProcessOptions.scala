package typings.yandexMoneySdk.YandexMoneySDK.ExternalPayment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessOptions extends js.Object {
  var csc: js.UndefOr[String] = js.native
  var ext_auth_fail_uri: String = js.native
  // instance_id: string; // the method always overwrites this value
  var ext_auth_success_uri: String = js.native
  var money_source_token: js.UndefOr[String] = js.native
  var request_id: String = js.native
  var request_token: js.UndefOr[Boolean] = js.native
}

object ProcessOptions {
  @scala.inline
  def apply(ext_auth_fail_uri: String, ext_auth_success_uri: String, request_id: String): ProcessOptions = {
    val __obj = js.Dynamic.literal(ext_auth_fail_uri = ext_auth_fail_uri.asInstanceOf[js.Any], ext_auth_success_uri = ext_auth_success_uri.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessOptions]
  }
  @scala.inline
  implicit class ProcessOptionsOps[Self <: ProcessOptions] (val x: Self) extends AnyVal {
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
    def setExt_auth_fail_uri(value: String): Self = this.set("ext_auth_fail_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt_auth_success_uri(value: String): Self = this.set("ext_auth_success_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest_id(value: String): Self = this.set("request_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCsc(value: String): Self = this.set("csc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsc: Self = this.set("csc", js.undefined)
    @scala.inline
    def setMoney_source_token(value: String): Self = this.set("money_source_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoney_source_token: Self = this.set("money_source_token", js.undefined)
    @scala.inline
    def setRequest_token(value: Boolean): Self = this.set("request_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_token: Self = this.set("request_token", js.undefined)
  }
  
}

