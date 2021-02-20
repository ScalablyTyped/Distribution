package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  下载
@js.native
trait OnProgressCallbackOptions extends StObject {
  
  //  下载进度百分比
  var progress: Double = js.native
  
  //  预期需要下载的数据总长度，单位 Bytes
  var totalBytesExpectedToWrite: Double = js.native
  
  //  已经下载的数据长度，单位 Bytes
  var totalBytesWritten: Double = js.native
}
object OnProgressCallbackOptions {
  
  @scala.inline
  def apply(progress: Double, totalBytesExpectedToWrite: Double, totalBytesWritten: Double): OnProgressCallbackOptions = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnProgressCallbackOptions]
  }
  
  @scala.inline
  implicit class OnProgressCallbackOptionsMutableBuilder[Self <: OnProgressCallbackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesExpectedToWrite(value: Double): Self = StObject.set(x, "totalBytesExpectedToWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesWritten(value: Double): Self = StObject.set(x, "totalBytesWritten", value.asInstanceOf[js.Any])
  }
}
