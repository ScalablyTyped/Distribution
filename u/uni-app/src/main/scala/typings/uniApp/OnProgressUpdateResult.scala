package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnProgressUpdateResult extends StObject {
  
  /**
    * 上传进度百分比
    */
  var progress: js.UndefOr[Double] = js.native
  
  /**
    * 预期需要上传的数据总长度，单位 Bytes
    */
  var totalBytesExpectedToSend: js.UndefOr[Double] = js.native
  
  /**
    * 已经上传的数据长度，单位 Bytes
    */
  var totalBytesSent: js.UndefOr[Double] = js.native
}
object OnProgressUpdateResult {
  
  @scala.inline
  def apply(): OnProgressUpdateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnProgressUpdateResult]
  }
  
  @scala.inline
  implicit class OnProgressUpdateResultMutableBuilder[Self <: OnProgressUpdateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setTotalBytesExpectedToSend(value: Double): Self = StObject.set(x, "totalBytesExpectedToSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesExpectedToSendUndefined: Self = StObject.set(x, "totalBytesExpectedToSend", js.undefined)
    
    @scala.inline
    def setTotalBytesSent(value: Double): Self = StObject.set(x, "totalBytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesSentUndefined: Self = StObject.set(x, "totalBytesSent", js.undefined)
  }
}
