package typings.uniApp

import typings.uniApp.uniAppStrings.oauth
import typings.uniApp.uniAppStrings.payment
import typings.uniApp.uniAppStrings.push
import typings.uniApp.uniAppStrings.share
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProviderOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 服务类型，可取值“oauth”、“share”、“payment”、“push”
    * - oauth: 授权登录
    * - share: 分享
    * - payment: 支付
    * - push: 推送
    */
  var service: js.UndefOr[oauth | share | payment | push] = js.native
  /**
    * 接口调用成功的回调
    */
  var success: js.UndefOr[js.Function1[/* result */ GetProviderRes, Unit]] = js.native
}

object GetProviderOptions {
  @scala.inline
  def apply(): GetProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProviderOptions]
  }
  @scala.inline
  implicit class GetProviderOptionsOps[Self <: GetProviderOptions] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setService(value: oauth | share | payment | push): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ GetProviderRes => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

