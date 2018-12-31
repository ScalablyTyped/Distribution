package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebSocket
trait ConnectSocketOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 请求的数据 */
  var data: js.UndefOr[js.Any] = js.undefined
  /** HTTP Header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 默认是GET，有效值为： OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 子协议数组
  		 * @version 1.4.0
  		 */
  var protocols: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** 开发者服务器接口地址，必须是 HTTPS 协议，且域名必须是后台配置的合法域名 */
  var url: java.lang.String
}

