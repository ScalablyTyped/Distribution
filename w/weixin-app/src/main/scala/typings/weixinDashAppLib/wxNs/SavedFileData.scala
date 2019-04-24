package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFileData extends js.Object {
  /** 文件的保存路径 */
  var savedFilePath: java.lang.String
}

object SavedFileData {
  @scala.inline
  def apply(savedFilePath: java.lang.String): SavedFileData = {
    val __obj = js.Dynamic.literal(savedFilePath = savedFilePath)
  
    __obj.asInstanceOf[SavedFileData]
  }
}

