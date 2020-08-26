package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RmdirOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RmdirCompleteCallback] = js.native
  /** 要删除的目录路径 (本地路径) */
  var dirPath: String = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RmdirFailCallback] = js.native
  /** 是否递归删除目录。如果为 true，则删除该目录和该目录下的所有子目录以及文件。
    *
    * 最低基础库： `2.3.0` */
  var recursive: js.UndefOr[Boolean] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RmdirSuccessCallback] = js.native
}

object RmdirOption {
  @scala.inline
  def apply(dirPath: String): RmdirOption = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmdirOption]
  }
  @scala.inline
  implicit class RmdirOptionOps[Self <: RmdirOption] (val x: Self) extends AnyVal {
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
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* result */ RmdirFailCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

