package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MkdirOptions
  extends BaseOptions[js.Any, js.Any] {
  var dirPath: String = js.native
   // 创建的目录路径
  var recursive: js.UndefOr[Boolean] = js.native
}

object MkdirOptions {
  @scala.inline
  def apply(dirPath: String): MkdirOptions = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[MkdirOptions]
  }
  @scala.inline
  implicit class MkdirOptionsOps[Self <: MkdirOptions] (val x: Self) extends AnyVal {
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
    def setDirPath(value: String): Self = this.set("dirPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
  
}

