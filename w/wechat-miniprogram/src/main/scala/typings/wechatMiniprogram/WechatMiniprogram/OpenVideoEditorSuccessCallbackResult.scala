package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenVideoEditorSuccessCallbackResult extends js.Object {
  
  /** 剪辑后生成的视频文件的时长，单位毫秒（ms） */
  var duration: Double = js.native
  
  var errMsg: String = js.native
  
  /** 剪辑后生成的视频文件大小，单位字节数（byte） */
  var size: Double = js.native
  
  /** 编辑后生成的视频文件的临时路径 */
  var tempFilePath: String = js.native
  
  /** 编辑后生成的缩略图文件的临时路径 */
  var tempThumbPath: String = js.native
}
object OpenVideoEditorSuccessCallbackResult {
  
  @scala.inline
  def apply(duration: Double, errMsg: String, size: Double, tempFilePath: String, tempThumbPath: String): OpenVideoEditorSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any], tempThumbPath = tempThumbPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenVideoEditorSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class OpenVideoEditorSuccessCallbackResultOps[Self <: OpenVideoEditorSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePath(value: String): Self = this.set("tempFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempThumbPath(value: String): Self = this.set("tempThumbPath", value.asInstanceOf[js.Any])
  }
}
