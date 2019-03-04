package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebSocketErrorStatics extends js.Object {
  def getStatus(hresult: scala.Double): winrtLib.WindowsNs.WebNs.WebErrorStatus
}

object IWebSocketErrorStatics {
  @scala.inline
  def apply(getStatus: js.Function1[scala.Double, winrtLib.WindowsNs.WebNs.WebErrorStatus]): IWebSocketErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = getStatus)
  
    __obj.asInstanceOf[IWebSocketErrorStatics]
  }
}

