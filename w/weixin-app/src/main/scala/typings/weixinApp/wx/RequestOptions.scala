package typings.weixinApp.wx

import typings.std.ArrayBuffer
import typings.weixinApp.weixinAppStrings.CONNECT
import typings.weixinApp.weixinAppStrings.DELETE
import typings.weixinApp.weixinAppStrings.GET
import typings.weixinApp.weixinAppStrings.HEAD
import typings.weixinApp.weixinAppStrings.OPTIONS
import typings.weixinApp.weixinAppStrings.POST
import typings.weixinApp.weixinAppStrings.PUT
import typings.weixinApp.weixinAppStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions
  extends BaseOptions[DataResponse, js.Any] {
  /** 请求的参数 */
  var data: js.UndefOr[String | js.Object | ArrayBuffer] = js.undefined
  /** 如果设为json，会尝试对返回的数据做一次 JSON.parse */
  var dataType: js.UndefOr[String] = js.undefined
  /** 设置请求的 header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 默认为 GET，有效值：OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.undefined
  /**
    * 设置响应的数据类型。合法值：text、arraybuffer
    * @version 1.7.0
    */
  var responseType: js.UndefOr[String] = js.undefined
  /** 开发者服务器接口地址 */
  var url: String
}

object RequestOptions {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ js.Any => Unit = null,
    data: String | js.Object | ArrayBuffer = null,
    dataType: String = null,
    fail: js.Any => Unit = null,
    header: RequestHeader = null,
    method: GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT = null,
    responseType: String = null,
    success: DataResponse => Unit = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[RequestOptions]
  }
}

