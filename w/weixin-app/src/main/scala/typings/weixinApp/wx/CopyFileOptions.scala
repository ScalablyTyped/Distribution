package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyFileOptions
  extends BaseOptions[js.Any, js.Any] {
   // 源文件路径，只可以是普通文件
  var destPath: String = js.native
  var srcPath: String = js.native
}

object CopyFileOptions {
  @scala.inline
  def apply(destPath: String, srcPath: String): CopyFileOptions = {
    val __obj = js.Dynamic.literal(destPath = destPath.asInstanceOf[js.Any], srcPath = srcPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyFileOptions]
  }
  @scala.inline
  implicit class CopyFileOptionsOps[Self <: CopyFileOptions] (val x: Self) extends AnyVal {
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
    def setDestPath(value: String): Self = this.set("destPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcPath(value: String): Self = this.set("srcPath", value.asInstanceOf[js.Any])
  }
  
}

