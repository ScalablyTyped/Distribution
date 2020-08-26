package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RenameCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RenameFailCallback] = js.native
  /** 新文件路径，支持本地路径 */
  var newPath: String = js.native
  /** 源文件路径，支持本地路径 */
  var oldPath: String = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RenameSuccessCallback] = js.native
}

object RenameOption {
  @scala.inline
  def apply(newPath: String, oldPath: String): RenameOption = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameOption]
  }
  @scala.inline
  implicit class RenameOptionOps[Self <: RenameOption] (val x: Self) extends AnyVal {
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
    def setNewPath(value: String): Self = this.set("newPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldPath(value: String): Self = this.set("oldPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* result */ RenameFailCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

