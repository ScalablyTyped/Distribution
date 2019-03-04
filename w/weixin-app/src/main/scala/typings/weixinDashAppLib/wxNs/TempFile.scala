package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFile extends js.Object {
  /** 本地文件路径 */
  var path: java.lang.String
  /** 本地文件大小，单位：B */
  var size: scala.Double
}

object TempFile {
  @scala.inline
  def apply(path: java.lang.String, size: scala.Double): TempFile = {
    val __obj = js.Dynamic.literal(path = path, size = size)
  
    __obj.asInstanceOf[TempFile]
  }
}

