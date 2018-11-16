package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScanCodeData extends js.Object {
  /**
  		 * 所扫码的字符集
  		 */
  var charSet: java.lang.String
  /**
  		 * 当所扫的码为当前小程序的合法二维码时，会返回此字段，内容为二维码携带的 path
  		 */
  var path: java.lang.String
  /**
  		 * 所扫码的内容
  		 */
  var result: java.lang.String
  /**
  		 * 所扫码的类型
  		 */
  var scanType: scanType
}

