package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnzipOptions
  extends BaseOptions[js.Any, js.Any] {
   // 源文件路径，只可以是 zip 压缩文件
  var targetPath: String = js.native
  var zipFilePath: String = js.native
}

object UnzipOptions {
  @scala.inline
  def apply(targetPath: String, zipFilePath: String): UnzipOptions = {
    val __obj = js.Dynamic.literal(targetPath = targetPath.asInstanceOf[js.Any], zipFilePath = zipFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnzipOptions]
  }
  @scala.inline
  implicit class UnzipOptionsOps[Self <: UnzipOptions] (val x: Self) extends AnyVal {
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
    def setTargetPath(value: String): Self = this.set("targetPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setZipFilePath(value: String): Self = this.set("zipFilePath", value.asInstanceOf[js.Any])
  }
  
}

