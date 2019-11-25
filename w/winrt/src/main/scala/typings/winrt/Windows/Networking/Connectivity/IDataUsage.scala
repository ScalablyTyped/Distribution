package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataUsage extends js.Object {
  var bytesReceived: Double
  var bytesSent: Double
}

object IDataUsage {
  @scala.inline
  def apply(bytesReceived: Double, bytesSent: Double): IDataUsage = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDataUsage]
  }
}

