package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WxSaveFileSuccessCallbackResult extends js.Object {
  var errMsg: String = js.native
  /** 存储后的文件路径 (本地路径) */
  var savedFilePath: Double = js.native
}

object WxSaveFileSuccessCallbackResult {
  @scala.inline
  def apply(errMsg: String, savedFilePath: Double): WxSaveFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], savedFilePath = savedFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WxSaveFileSuccessCallbackResult]
  }
  @scala.inline
  implicit class WxSaveFileSuccessCallbackResultOps[Self <: WxSaveFileSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setSavedFilePath(value: Double): Self = this.set("savedFilePath", value.asInstanceOf[js.Any])
  }
  
}

