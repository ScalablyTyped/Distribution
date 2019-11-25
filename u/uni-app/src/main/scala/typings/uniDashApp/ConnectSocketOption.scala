package typings.uniDashApp

import typings.uniDashApp.uniDashAppStrings.CONNECT
import typings.uniDashApp.uniDashAppStrings.DELETE
import typings.uniDashApp.uniDashAppStrings.GET
import typings.uniDashApp.uniDashAppStrings.HEAD
import typings.uniDashApp.uniDashAppStrings.OPTIONS
import typings.uniDashApp.uniDashAppStrings.POST
import typings.uniDashApp.uniDashAppStrings.PUT
import typings.uniDashApp.uniDashAppStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectSocketOption extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * HTTP 请求 Header，header 中不能设置 Referer
    */
  var header: js.UndefOr[js.Any] = js.undefined
  /**
    * 默认为 GET
    * 可以是：OPTIONS，GET，HEAD，POST，PUT，DELETE，TRACE，CONNECT
    */
  var method: js.UndefOr[OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.undefined
  /**
    * 子协议数组
    */
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 开发者服务器接口地址，必须是 wss 协议，且域名必须是后台配置的合法域名
    */
  var url: js.UndefOr[String] = js.undefined
}

object ConnectSocketOption {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    header: js.Any = null,
    method: OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT = null,
    protocols: js.Array[String] = null,
    success: () => Unit = null,
    url: String = null
  ): ConnectSocketOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectSocketOption]
  }
}

