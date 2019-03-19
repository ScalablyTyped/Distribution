package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, scala.Unit]] = js.undefined
  /**
    * 请求的参数
    */
  var data: js.UndefOr[java.lang.String | js.Object | stdLib.ArrayBuffer] = js.undefined
  /**
    * 如果设为json，会尝试对返回的数据做一次 JSON.parse
    */
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, scala.Unit]] = js.undefined
  /**
    * 设置请求的 header，header 中不能设置 Referer。
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
    * 设置响应的数据类型。合法值：text、arraybuffer
    */
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ RequestSuccessCallbackResult, scala.Unit]] = js.undefined
  /**
    * 资源url
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    complete: /* result */ GeneralCallbackResult => scala.Unit = null,
    data: java.lang.String | js.Object | stdLib.ArrayBuffer = null,
    dataType: java.lang.String = null,
    fail: /* result */ GeneralCallbackResult => scala.Unit = null,
    header: js.Any = null,
    method: uniDashAppLib.uniDashAppLibStrings.OPTIONS | uniDashAppLib.uniDashAppLibStrings.GET | uniDashAppLib.uniDashAppLibStrings.HEAD | uniDashAppLib.uniDashAppLibStrings.POST | uniDashAppLib.uniDashAppLibStrings.PUT | uniDashAppLib.uniDashAppLibStrings.DELETE | uniDashAppLib.uniDashAppLibStrings.TRACE | uniDashAppLib.uniDashAppLibStrings.CONNECT = null,
    responseType: java.lang.String = null,
    success: /* result */ RequestSuccessCallbackResult => scala.Unit = null,
    url: java.lang.String = null
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

