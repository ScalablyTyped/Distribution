package typings.uniApp

import typings.uniApp.uniAppStrings.oauth
import typings.uniApp.uniAppStrings.payment
import typings.uniApp.uniAppStrings.push
import typings.uniApp.uniAppStrings.share
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProviderRes extends js.Object {
  /**
    * 得到的服务供应商
    */
  var provider: js.UndefOr[js.Array[_]] = js.native
  /**
    * 服务类型
    * - oauth: 授权登录
    * - share: 分享
    * - payment: 支付
    * - push: 推送
    */
  var service: js.UndefOr[oauth | share | payment | push] = js.native
}

object GetProviderRes {
  @scala.inline
  def apply(): GetProviderRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProviderRes]
  }
  @scala.inline
  implicit class GetProviderResOps[Self <: GetProviderRes] (val x: Self) extends AnyVal {
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
    def setProviderVarargs(value: js.Any*): Self = this.set("provider", js.Array(value :_*))
    @scala.inline
    def setProvider(value: js.Array[_]): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setService(value: oauth | share | payment | push): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

