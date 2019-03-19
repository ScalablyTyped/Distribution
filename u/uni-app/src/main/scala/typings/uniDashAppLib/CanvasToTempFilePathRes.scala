package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasToTempFilePathRes extends js.Object {
  /**
    * 导出生成的图片路径
    */
  var tempFilePath: js.UndefOr[java.lang.String] = js.undefined
}

object CanvasToTempFilePathRes {
  @scala.inline
  def apply(tempFilePath: java.lang.String = null): CanvasToTempFilePathRes = {
    val __obj = js.Dynamic.literal()
    if (tempFilePath != null) __obj.updateDynamic("tempFilePath")(tempFilePath)
    __obj.asInstanceOf[CanvasToTempFilePathRes]
  }
}

