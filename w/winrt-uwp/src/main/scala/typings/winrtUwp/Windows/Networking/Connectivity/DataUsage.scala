package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data usage information returned by the ConnectionProfile.GetLocalUsage method. */
trait DataUsage extends js.Object {
  /** Gets a value indicating the number of bytes received by a connection over a specific period of time. */
  var bytesReceived: Double
  /** Gets a value indicating the number of bytes sent by the connection over a specific period of time. */
  var bytesSent: Double
}

object DataUsage {
  @scala.inline
  def apply(bytesReceived: Double, bytesSent: Double): DataUsage = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataUsage]
  }
}

