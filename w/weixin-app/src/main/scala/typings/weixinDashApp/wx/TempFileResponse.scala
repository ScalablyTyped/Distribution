package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFileResponse extends js.Object {
  /** 文件的临时路径 */
  var tempFilePath: String
}

object TempFileResponse {
  @scala.inline
  def apply(tempFilePath: String): TempFileResponse = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath)
  
    __obj.asInstanceOf[TempFileResponse]
  }
}

