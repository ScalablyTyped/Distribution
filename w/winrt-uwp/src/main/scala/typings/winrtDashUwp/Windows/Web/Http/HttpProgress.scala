package typings.winrtDashUwp.Windows.Web.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains status information on the progress of an HttpClient operation. */
trait HttpProgress extends js.Object {
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
}

