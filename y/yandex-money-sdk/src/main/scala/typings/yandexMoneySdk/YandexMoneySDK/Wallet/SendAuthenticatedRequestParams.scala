package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAuthenticatedRequestParams extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var url: String = js.native
}

object SendAuthenticatedRequestParams {
  @scala.inline
  def apply(url: String): SendAuthenticatedRequestParams = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAuthenticatedRequestParams]
  }
  @scala.inline
  implicit class SendAuthenticatedRequestParamsOps[Self <: SendAuthenticatedRequestParams] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
  
}

