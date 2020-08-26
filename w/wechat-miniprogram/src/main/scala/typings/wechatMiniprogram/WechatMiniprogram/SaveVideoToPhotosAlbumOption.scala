package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveVideoToPhotosAlbumOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SaveVideoToPhotosAlbumCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SaveVideoToPhotosAlbumFailCallback] = js.native
  /** 视频文件路径，可以是临时文件路径也可以是永久文件路径 (本地路径) */
  var filePath: String = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SaveVideoToPhotosAlbumSuccessCallback] = js.native
}

object SaveVideoToPhotosAlbumOption {
  @scala.inline
  def apply(filePath: String): SaveVideoToPhotosAlbumOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveVideoToPhotosAlbumOption]
  }
  @scala.inline
  implicit class SaveVideoToPhotosAlbumOptionOps[Self <: SaveVideoToPhotosAlbumOption] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

