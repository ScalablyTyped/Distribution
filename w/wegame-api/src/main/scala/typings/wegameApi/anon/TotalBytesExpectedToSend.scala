package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalBytesExpectedToSend extends StObject {
  
  var progress: Double
  
  var totalBytesExpectedToSend: Double
  
  var totalBytesSent: Double
}
object TotalBytesExpectedToSend {
  
  @scala.inline
  def apply(progress: Double, totalBytesExpectedToSend: Double, totalBytesSent: Double): TotalBytesExpectedToSend = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], totalBytesExpectedToSend = totalBytesExpectedToSend.asInstanceOf[js.Any], totalBytesSent = totalBytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalBytesExpectedToSend]
  }
  
  @scala.inline
  implicit class TotalBytesExpectedToSendMutableBuilder[Self <: TotalBytesExpectedToSend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesExpectedToSend(value: Double): Self = StObject.set(x, "totalBytesExpectedToSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesSent(value: Double): Self = StObject.set(x, "totalBytesSent", value.asInstanceOf[js.Any])
  }
}
