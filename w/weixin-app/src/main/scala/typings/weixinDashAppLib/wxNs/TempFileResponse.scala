package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFileResponse extends js.Object {
  /** 文件的临时路径 */
  var tempFilePath: java.lang.String
}

object TempFileResponse {
  @scala.inline
  def apply(tempFilePath: java.lang.String): TempFileResponse = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath)
  
    __obj.asInstanceOf[TempFileResponse]
  }
}

