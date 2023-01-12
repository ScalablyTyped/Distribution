package typings.winrtUwp.Windows.Web.Http

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains status information on the progress of an HttpClient operation. */
trait HttpProgress extends StObject {
  
  /** The total number of bytes received. */
  var bytesReceived: Double
  
  /** The total number of bytes sent. */
  var bytesSent: Double
  
  /** The number of retries. */
  var retries: Double
  
  /** The step in the progress of an HTTP connection. */
  var stage: HttpProgressStage
  
  /** The total number of data bytes to receive. */
  var totalBytesToReceive: Double
  
  /** The total number of data bytes to send. */
  var totalBytesToSend: Double
}
object HttpProgress {
  
  inline def apply(
    bytesReceived: Double,
    bytesSent: Double,
    retries: Double,
    stage: HttpProgressStage,
    totalBytesToReceive: Double,
    totalBytesToSend: Double
  ): HttpProgress = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], totalBytesToReceive = totalBytesToReceive.asInstanceOf[js.Any], totalBytesToSend = totalBytesToSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProgress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpProgress] (val x: Self) extends AnyVal {
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setStage(value: HttpProgressStage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesToReceive(value: Double): Self = StObject.set(x, "totalBytesToReceive", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesToSend(value: Double): Self = StObject.set(x, "totalBytesToSend", value.asInstanceOf[js.Any])
  }
}
