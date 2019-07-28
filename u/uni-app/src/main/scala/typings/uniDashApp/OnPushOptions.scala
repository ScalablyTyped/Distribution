package typings.uniDashApp

import typings.uniDashApp.uniDashAppStrings.igexin
import typings.uniDashApp.uniDashAppStrings.mipush
import typings.uniDashApp.uniDashAppStrings.unipush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPushOptions extends js.Object {
  /**
    * 接收到透传数据回调，回调参数（Object）：messageId（消息id）、data（消息内容）
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 推送服务提供商，通过uni.getProvider获取
    * - unipush: UniPush
    * - igexin: 个推
    * - mipush: 小米推送
    */
  var provider: js.UndefOr[unipush | igexin | mipush] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object OnPushOptions {
  @scala.inline
  def apply(
    callback: () => Unit = null,
    complete: () => Unit = null,
    fail: () => Unit = null,
    provider: unipush | igexin | mipush = null,
    success: () => Unit = null
  ): OnPushOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[OnPushOptions]
  }
}

