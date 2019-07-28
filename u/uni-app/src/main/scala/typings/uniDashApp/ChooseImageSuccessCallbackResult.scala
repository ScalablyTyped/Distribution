package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseImageSuccessCallbackResult extends js.Object {
  /**
    * 图片的本地文件路径列表
    */
  var tempFilePaths: js.UndefOr[String | js.Array[_]] = js.undefined
  /**
    * 图片的本地文件列表，每一项是一个 File 对象
    */
  var tempFiles: js.UndefOr[
    ChooseImageSuccessCallbackResultFile | js.Array[ChooseImageSuccessCallbackResultFile]
  ] = js.undefined
}

object ChooseImageSuccessCallbackResult {
  @scala.inline
  def apply(
    tempFilePaths: String | js.Array[_] = null,
    tempFiles: ChooseImageSuccessCallbackResultFile | js.Array[ChooseImageSuccessCallbackResultFile] = null
  ): ChooseImageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal()
    if (tempFilePaths != null) __obj.updateDynamic("tempFilePaths")(tempFilePaths.asInstanceOf[js.Any])
    if (tempFiles != null) __obj.updateDynamic("tempFiles")(tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseImageSuccessCallbackResult]
  }
}

