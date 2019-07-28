package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressImageSuccessData extends js.Object {
  /**
    * 压缩后图片的临时文件路径
    */
  var tempFilePath: js.UndefOr[String] = js.undefined
}

object CompressImageSuccessData {
  @scala.inline
  def apply(tempFilePath: String = null): CompressImageSuccessData = {
    val __obj = js.Dynamic.literal()
    if (tempFilePath != null) __obj.updateDynamic("tempFilePath")(tempFilePath)
    __obj.asInstanceOf[CompressImageSuccessData]
  }
}

