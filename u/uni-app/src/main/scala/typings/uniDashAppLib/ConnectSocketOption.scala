package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectSocketOption extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * HTTP 请求 Header，header 中不能设置 Referer
    */
  var header: js.UndefOr[js.Any] = js.undefined
  /**
    * 默认为 GET
    * 可以是：OPTIONS，GET，HEAD，POST，PUT，DELETE，TRACE，CONNECT
    */
  var method: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.OPTIONS | uniDashAppLib.uniDashAppLibStrings.GET | uniDashAppLib.uniDashAppLibStrings.HEAD | uniDashAppLib.uniDashAppLibStrings.POST | uniDashAppLib.uniDashAppLibStrings.PUT | uniDashAppLib.uniDashAppLibStrings.DELETE | uniDashAppLib.uniDashAppLibStrings.TRACE | uniDashAppLib.uniDashAppLibStrings.CONNECT
  ] = js.undefined
  /**
    * 子协议数组
    */
  var protocols: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 开发者服务器接口地址，必须是 wss 协议，且域名必须是后台配置的合法域名
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectSocketOption {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    header: js.Any = null,
    method: uniDashAppLib.uniDashAppLibStrings.OPTIONS | uniDashAppLib.uniDashAppLibStrings.GET | uniDashAppLib.uniDashAppLibStrings.HEAD | uniDashAppLib.uniDashAppLibStrings.POST | uniDashAppLib.uniDashAppLibStrings.PUT | uniDashAppLib.uniDashAppLibStrings.DELETE | uniDashAppLib.uniDashAppLibStrings.TRACE | uniDashAppLib.uniDashAppLibStrings.CONNECT = null,
    protocols: js.Array[java.lang.String] = null,
    success: () => scala.Unit = null,
    url: java.lang.String = null
  ): ConnectSocketOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (header != null) __obj.updateDynamic("header")(header)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ConnectSocketOption]
  }
}

