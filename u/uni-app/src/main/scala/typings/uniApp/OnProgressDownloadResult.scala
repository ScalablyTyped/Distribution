package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnProgressDownloadResult extends StObject {
  
  /**
    * 下载进度百分比
    */
  var progress: js.UndefOr[Double] = js.undefined
  
  /**
    * 预期需要下载的数据总长度，单位 Bytes
    */
  var totalBytesExpectedToWrite: js.UndefOr[Double] = js.undefined
  
  /**
    * 已经下载的数据长度，单位 Bytes
    */
  var totalBytesWritten: js.UndefOr[Double] = js.undefined
}
object OnProgressDownloadResult {
  
  inline def apply(): OnProgressDownloadResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnProgressDownloadResult]
  }
  
  extension [Self <: OnProgressDownloadResult](x: Self) {
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setTotalBytesExpectedToWrite(value: Double): Self = StObject.set(x, "totalBytesExpectedToWrite", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesExpectedToWriteUndefined: Self = StObject.set(x, "totalBytesExpectedToWrite", js.undefined)
    
    inline def setTotalBytesWritten(value: Double): Self = StObject.set(x, "totalBytesWritten", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesWrittenUndefined: Self = StObject.set(x, "totalBytesWritten", js.undefined)
  }
}
