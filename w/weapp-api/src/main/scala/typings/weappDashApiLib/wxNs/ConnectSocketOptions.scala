package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectSocketOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 请求的数据 */
  var data: js.UndefOr[js.Any] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** HTTP Header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 默认是GET，有效值为： OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ResponseCallback] = js.undefined
  /** 开发者服务器接口地址，必须是 HTTPS 协议，且域名必须是后台配置的合法域名 */
  var url: java.lang.String
}

