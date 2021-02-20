package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferProgress extends StObject {
  
  var bytesRetrieved: Double = js.native
  
  var bytesSent: Double = js.native
  
  var totalBytesToRetrieve: Double = js.native
  
  var totalBytesToSend: Double = js.native
}
object TransferProgress {
  
  @scala.inline
  def apply(bytesRetrieved: Double, bytesSent: Double, totalBytesToRetrieve: Double, totalBytesToSend: Double): TransferProgress = {
    val __obj = js.Dynamic.literal(bytesRetrieved = bytesRetrieved.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], totalBytesToRetrieve = totalBytesToRetrieve.asInstanceOf[js.Any], totalBytesToSend = totalBytesToSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferProgress]
  }
  
  @scala.inline
  implicit class TransferProgressMutableBuilder[Self <: TransferProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesRetrieved(value: Double): Self = StObject.set(x, "bytesRetrieved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToRetrieve(value: Double): Self = StObject.set(x, "totalBytesToRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToSend(value: Double): Self = StObject.set(x, "totalBytesToSend", value.asInstanceOf[js.Any])
  }
}
