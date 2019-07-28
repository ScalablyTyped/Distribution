package typings.uniDashApp

import typings.std.ArrayBuffer
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

trait RequestOptions extends js.Object {
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
  /**
    * 请求的参数
    */
  var data: js.UndefOr[String | js.Object | ArrayBuffer] = js.undefined
  /**
    * 如果设为json，会尝试对返回的数据做一次 JSON.parse
    */
  var dataType: js.UndefOr[String] = js.undefined
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
  /**
    * 设置请求的 header，header 中不能设置 Referer。
    */
  var header: js.UndefOr[js.Any] = js.undefined
  /**
    * 默认为 GET
    * 可以是：OPTIONS，GET，HEAD，POST，PUT，DELETE，TRACE，CONNECT
    */
  var method: js.UndefOr[OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.undefined
  /**
    * 设置响应的数据类型。合法值：text、arraybuffer
    */
  var responseType: js.UndefOr[String] = js.undefined
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ RequestSuccessCallbackResult, Unit]] = js.undefined
  /**
    * 资源url
    */
  var url: js.UndefOr[String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    complete: /* result */ GeneralCallbackResult => Unit = null,
    data: String | js.Object | ArrayBuffer = null,
    dataType: String = null,
    fail: /* result */ GeneralCallbackResult => Unit = null,
    header: js.Any = null,
    method: OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT = null,
    responseType: String = null,
    success: /* result */ RequestSuccessCallbackResult => Unit = null,
    url: String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (header != null) __obj.updateDynamic("header")(header)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RequestOptions]
  }
}

