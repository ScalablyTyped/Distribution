package typings.uniApp

import typings.uniApp.uniAppStrings.oauth
import typings.uniApp.uniAppStrings.payment
import typings.uniApp.uniAppStrings.push
import typings.uniApp.uniAppStrings.share
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProviderOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 服务类型，可取值“oauth”、“share”、“payment”、“push”
    * - oauth: 授权登录
    * - share: 分享
    * - payment: 支付
    * - push: 推送
    */
  var service: js.UndefOr[oauth | share | payment | push] = js.undefined
  /**
    * 接口调用成功的回调
    */
  var success: js.UndefOr[js.Function1[/* result */ GetProviderRes, Unit]] = js.undefined
}

object GetProviderOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    service: oauth | share | payment | push = null,
    success: /* result */ GetProviderRes => Unit = null
  ): GetProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetProviderOptions]
  }
}

