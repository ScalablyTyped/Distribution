package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseMediaSuccessCallbackResult extends js.Object {
  var errMsg: String = js.native
  /** 本地临时文件列表 */
  var tempFiles: js.Array[MediaFile] = js.native
  /** 文件类型，有效值有 image 、video */
  var `type`: String = js.native
}

object ChooseMediaSuccessCallbackResult {
  @scala.inline
  def apply(errMsg: String, tempFiles: js.Array[MediaFile], `type`: String): ChooseMediaSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseMediaSuccessCallbackResult]
  }
  @scala.inline
  implicit class ChooseMediaSuccessCallbackResultOps[Self <: ChooseMediaSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempFilesVarargs(value: MediaFile*): Self = this.set("tempFiles", js.Array(value :_*))
    @scala.inline
    def setTempFiles(value: js.Array[MediaFile]): Self = this.set("tempFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

