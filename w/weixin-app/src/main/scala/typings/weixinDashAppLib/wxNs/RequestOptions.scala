package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions
  extends BaseOptions[DataResponse, js.Any] {
  /** 请求的参数 */
  var data: js.UndefOr[java.lang.String | js.Object | stdLib.ArrayBuffer] = js.undefined
  /** 如果设为json，会尝试对返回的数据做一次 JSON.parse */
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  /** 设置请求的 header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 默认为 GET，有效值：OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[
    weixinDashAppLib.weixinDashAppLibStrings.GET | weixinDashAppLib.weixinDashAppLibStrings.OPTIONS | weixinDashAppLib.weixinDashAppLibStrings.HEAD | weixinDashAppLib.weixinDashAppLibStrings.POST | weixinDashAppLib.weixinDashAppLibStrings.PUT | weixinDashAppLib.weixinDashAppLibStrings.DELETE | weixinDashAppLib.weixinDashAppLibStrings.TRACE | weixinDashAppLib.weixinDashAppLibStrings.CONNECT
  ] = js.undefined
  /**
  		 * 设置响应的数据类型。合法值：text、arraybuffer
  		 * @version 1.7.0
  		 */
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  /** 开发者服务器接口地址 */
  var url: java.lang.String
}

object RequestOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    data: java.lang.String | js.Object | stdLib.ArrayBuffer = null,
    dataType: java.lang.String = null,
    fail: js.Any => scala.Unit = null,
    header: RequestHeader = null,
    method: weixinDashAppLib.weixinDashAppLibStrings.GET | weixinDashAppLib.weixinDashAppLibStrings.OPTIONS | weixinDashAppLib.weixinDashAppLibStrings.HEAD | weixinDashAppLib.weixinDashAppLibStrings.POST | weixinDashAppLib.weixinDashAppLibStrings.PUT | weixinDashAppLib.weixinDashAppLibStrings.DELETE | weixinDashAppLib.weixinDashAppLibStrings.TRACE | weixinDashAppLib.weixinDashAppLibStrings.CONNECT = null,
    responseType: java.lang.String = null,
    success: /* res */ DataResponse => scala.Unit = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (header != null) __obj.updateDynamic("header")(header)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[RequestOptions]
  }
}

