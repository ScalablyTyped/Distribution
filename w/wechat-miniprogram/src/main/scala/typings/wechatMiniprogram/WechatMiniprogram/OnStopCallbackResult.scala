package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnStopCallbackResult extends StObject {
  
  /** 录音总时长，单位：ms */
  var duration: Double = js.native
  
  /** 录音文件大小，单位：Byte */
  var fileSize: Double = js.native
  
  /** 录音文件的临时路径 (本地路径) */
  var tempFilePath: String = js.native
}
object OnStopCallbackResult {
  
  @scala.inline
  def apply(duration: Double, fileSize: Double, tempFilePath: String): OnStopCallbackResult = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnStopCallbackResult]
  }
  
  @scala.inline
  implicit class OnStopCallbackResultMutableBuilder[Self <: OnStopCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
