package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRecordTimeoutCallbackResult extends StObject {
  
  /** 封面图片文件的临时路径 (本地路径) */
  var tempThumbPath: String
  
  /** 视频的文件的临时路径 (本地路径) */
  var tempVideoPath: String
}
object StartRecordTimeoutCallbackResult {
  
  inline def apply(tempThumbPath: String, tempVideoPath: String): StartRecordTimeoutCallbackResult = {
    val __obj = js.Dynamic.literal(tempThumbPath = tempThumbPath.asInstanceOf[js.Any], tempVideoPath = tempVideoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRecordTimeoutCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartRecordTimeoutCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setTempThumbPath(value: String): Self = StObject.set(x, "tempThumbPath", value.asInstanceOf[js.Any])
    
    inline def setTempVideoPath(value: String): Self = StObject.set(x, "tempVideoPath", value.asInstanceOf[js.Any])
  }
}
