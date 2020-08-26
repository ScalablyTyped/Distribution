package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseImageSuccessCallbackResult extends js.Object {
  /**
    * 图片的本地文件路径列表
    */
  var tempFilePaths: js.UndefOr[String | js.Array[_]] = js.native
  /**
    * 图片的本地文件列表，每一项是一个 File 对象
    */
  var tempFiles: js.UndefOr[
    ChooseImageSuccessCallbackResultFile | js.Array[ChooseImageSuccessCallbackResultFile]
  ] = js.native
}

object ChooseImageSuccessCallbackResult {
  @scala.inline
  def apply(): ChooseImageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageSuccessCallbackResult]
  }
  @scala.inline
  implicit class ChooseImageSuccessCallbackResultOps[Self <: ChooseImageSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTempFilePathsVarargs(value: js.Any*): Self = this.set("tempFilePaths", js.Array(value :_*))
    @scala.inline
    def setTempFilePaths(value: String | js.Array[_]): Self = this.set("tempFilePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTempFilePaths: Self = this.set("tempFilePaths", js.undefined)
    @scala.inline
    def setTempFilesVarargs(value: ChooseImageSuccessCallbackResultFile*): Self = this.set("tempFiles", js.Array(value :_*))
    @scala.inline
    def setTempFiles(value: ChooseImageSuccessCallbackResultFile | js.Array[ChooseImageSuccessCallbackResultFile]): Self = this.set("tempFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTempFiles: Self = this.set("tempFiles", js.undefined)
  }
  
}

