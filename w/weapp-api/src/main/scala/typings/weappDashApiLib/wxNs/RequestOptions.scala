package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 请求的参数 */
  var data: js.UndefOr[java.lang.String | js.Any] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 设置请求的 header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 默认为 GET，有效值：OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** 收到开发者服务成功返回的回调函数，res = {data: '开发者服务器返回的内容'} */
  var success: js.UndefOr[DataResponseCallback] = js.undefined
  /** 开发者服务器接口地址 */
  var url: java.lang.String
}

