package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempFilesData extends js.Object {
  /** 文件的临时路径 */
  var tempFilePaths: js.Array[String] = js.native
  /**
    * 图片的本地文件列表，每一项是一个 File 对象
    * @version 1.2.0
    */
  var tempFiles: js.Array[TempFile] = js.native
}

object TempFilesData {
  @scala.inline
  def apply(tempFilePaths: js.Array[String], tempFiles: js.Array[TempFile]): TempFilesData = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilesData]
  }
  @scala.inline
  implicit class TempFilesDataOps[Self <: TempFilesData] (val x: Self) extends AnyVal {
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
    def setTempFilePathsVarargs(value: String*): Self = this.set("tempFilePaths", js.Array(value :_*))
    @scala.inline
    def setTempFilePaths(value: js.Array[String]): Self = this.set("tempFilePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempFilesVarargs(value: TempFile*): Self = this.set("tempFiles", js.Array(value :_*))
    @scala.inline
    def setTempFiles(value: js.Array[TempFile]): Self = this.set("tempFiles", value.asInstanceOf[js.Any])
  }
  
}

