package typings.winrtUwp.Windows.Web.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains status information on the progress of an HttpClient operation. */
@js.native
trait HttpProgress extends js.Object {
  
  /** The total number of bytes received. */
  var bytesReceived: Double = js.native
  
  /** The total number of bytes sent. */
  var bytesSent: Double = js.native
  
  /** The number of retries. */
  var retries: Double = js.native
  
  /** The step in the progress of an HTTP connection. */
  var stage: HttpProgressStage = js.native
  
  /** The total number of data bytes to receive. */
  var totalBytesToReceive: Double = js.native
  
  /** The total number of data bytes to send. */
  var totalBytesToSend: Double = js.native
}
object HttpProgress {
  
  @scala.inline
  def apply(
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
  implicit class HttpProgressOps[Self <: HttpProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBytesReceived(value: Double): Self = this.set("bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSent(value: Double): Self = this.set("bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: HttpProgressStage): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToReceive(value: Double): Self = this.set("totalBytesToReceive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToSend(value: Double): Self = this.set("totalBytesToSend", value.asInstanceOf[js.Any])
  }
}
