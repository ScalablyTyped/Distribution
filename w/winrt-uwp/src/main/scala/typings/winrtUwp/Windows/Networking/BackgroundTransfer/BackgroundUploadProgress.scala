package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains status information about the upload operation. */
@js.native
trait BackgroundUploadProgress extends StObject {
  
  /** The total number of bytes received. This value does not include bytes received as part of response headers. If the upload operation has restarted, this value may be smaller than in the previous progress report. */
  var bytesReceived: Double = js.native
  
  /** The total number of bytes sent. If the upload operation has restarted, this value may be smaller than in the previous progress report. */
  var bytesSent: Double = js.native
  
  /** TRUE if the upload request response has changed; otherwise, FALSE. */
  var hasResponseChanged: Boolean = js.native
  
  /** true if a upload transfer operation has restarted; otherwise false. */
  var hasRestarted: Boolean = js.native
  
  /** The current status of the upload operation. */
  var status: BackgroundTransferStatus = js.native
  
  /** The total number of bytes of data to upload. If this number is unknown, this value is set to 0. */
  var totalBytesToReceive: Double = js.native
  
  /** The total number of bytes to upload. */
  var totalBytesToSend: Double = js.native
}
object BackgroundUploadProgress {
  
  @scala.inline
  def apply(
    bytesReceived: Double,
    bytesSent: Double,
    hasResponseChanged: Boolean,
    hasRestarted: Boolean,
    status: BackgroundTransferStatus,
    totalBytesToReceive: Double,
    totalBytesToSend: Double
  ): BackgroundUploadProgress = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], hasResponseChanged = hasResponseChanged.asInstanceOf[js.Any], hasRestarted = hasRestarted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], totalBytesToReceive = totalBytesToReceive.asInstanceOf[js.Any], totalBytesToSend = totalBytesToSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundUploadProgress]
  }
  
  @scala.inline
  implicit class BackgroundUploadProgressMutableBuilder[Self <: BackgroundUploadProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasResponseChanged(value: Boolean): Self = StObject.set(x, "hasResponseChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRestarted(value: Boolean): Self = StObject.set(x, "hasRestarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BackgroundTransferStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToReceive(value: Double): Self = StObject.set(x, "totalBytesToReceive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToSend(value: Double): Self = StObject.set(x, "totalBytesToSend", value.asInstanceOf[js.Any])
  }
}
