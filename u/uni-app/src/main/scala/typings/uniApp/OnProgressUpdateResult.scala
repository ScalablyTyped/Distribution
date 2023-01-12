package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnProgressUpdateResult extends StObject {
  
  /**
    * 上传进度百分比
    */
  var progress: js.UndefOr[Double] = js.undefined
  
  /**
    * 预期需要上传的数据总长度，单位 Bytes
    */
  var totalBytesExpectedToSend: js.UndefOr[Double] = js.undefined
  
  /**
    * 已经上传的数据长度，单位 Bytes
    */
  var totalBytesSent: js.UndefOr[Double] = js.undefined
}
object OnProgressUpdateResult {
  
  inline def apply(): OnProgressUpdateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnProgressUpdateResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnProgressUpdateResult] (val x: Self) extends AnyVal {
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setTotalBytesExpectedToSend(value: Double): Self = StObject.set(x, "totalBytesExpectedToSend", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesExpectedToSendUndefined: Self = StObject.set(x, "totalBytesExpectedToSend", js.undefined)
    
    inline def setTotalBytesSent(value: Double): Self = StObject.set(x, "totalBytesSent", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesSentUndefined: Self = StObject.set(x, "totalBytesSent", js.undefined)
  }
}
