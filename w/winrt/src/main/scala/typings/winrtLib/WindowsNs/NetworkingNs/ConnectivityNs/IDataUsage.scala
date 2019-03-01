package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataUsage extends js.Object {
  var bytesReceived: scala.Double
  var bytesSent: scala.Double
}

object IDataUsage {
  @scala.inline
  def apply(bytesReceived: scala.Double, bytesSent: scala.Double): IDataUsage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytesReceived")(bytesReceived)
    __obj.updateDynamic("bytesSent")(bytesSent)
    __obj.asInstanceOf[IDataUsage]
  }
}

