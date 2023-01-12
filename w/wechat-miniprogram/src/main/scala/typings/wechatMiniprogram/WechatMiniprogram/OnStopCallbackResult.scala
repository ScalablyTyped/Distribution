package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnStopCallbackResult extends StObject {
  
  /** 录音总时长，单位：ms */
  var duration: Double
  
  /** 录音文件大小，单位：Byte */
  var fileSize: Double
  
  /** 录音文件的临时路径 (本地路径) */
  var tempFilePath: String
}
object OnStopCallbackResult {
  
  inline def apply(duration: Double, fileSize: Double, tempFilePath: String): OnStopCallbackResult = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnStopCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnStopCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
