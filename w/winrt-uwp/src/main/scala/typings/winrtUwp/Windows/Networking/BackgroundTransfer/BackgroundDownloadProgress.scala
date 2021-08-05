package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains status information about the download operation. */
trait BackgroundDownloadProgress extends StObject {
  
  /** The total number of bytes received. This value does not include bytes received as response headers. */
  var bytesReceived: Double
  
  /** true if the download request response has changed; otherwise, false. */
  var hasResponseChanged: Boolean
  
  /** true if a data transfer operation has restarted; otherwise false. */
  var hasRestarted: Boolean
  
  /** The current status of the download operation. */
  var status: BackgroundTransferStatus
  
  /** The total number of bytes of data to download. If this number is unknown, this value is set to 0. */
  var totalBytesToReceive: Double
}
object BackgroundDownloadProgress {
  
  inline def apply(
    bytesReceived: Double,
    hasResponseChanged: Boolean,
    hasRestarted: Boolean,
    status: BackgroundTransferStatus,
    totalBytesToReceive: Double
  ): BackgroundDownloadProgress = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], hasResponseChanged = hasResponseChanged.asInstanceOf[js.Any], hasRestarted = hasRestarted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], totalBytesToReceive = totalBytesToReceive.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundDownloadProgress]
  }
  
  extension [Self <: BackgroundDownloadProgress](x: Self) {
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setHasResponseChanged(value: Boolean): Self = StObject.set(x, "hasResponseChanged", value.asInstanceOf[js.Any])
    
    inline def setHasRestarted(value: Boolean): Self = StObject.set(x, "hasRestarted", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: BackgroundTransferStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesToReceive(value: Double): Self = StObject.set(x, "totalBytesToReceive", value.asInstanceOf[js.Any])
  }
}
