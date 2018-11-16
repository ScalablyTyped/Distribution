package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LoginResponse extends js.Object {
  /** 用户允许登录后，回调内容会带上 code（有效期五分钟），
           * 开发者需要将 code 发送到开发者服务器后台，
           * 使用code 换取 session_key api，
           * 将 code 换成 openid 和 session_key */
  var code: java.lang.String
  /** 调用结果 */
  var errMsg: java.lang.String
}

