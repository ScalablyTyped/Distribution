package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenVideoEditorSuccessCallbackResult extends StObject {
  
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
  implicit class OpenVideoEditorSuccessCallbackResultMutableBuilder[Self <: OpenVideoEditorSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempThumbPath(value: String): Self = StObject.set(x, "tempThumbPath", value.asInstanceOf[js.Any])
  }
}
