package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Web.WebErrorStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebSocketErrorStatics extends js.Object {
  def getStatus(hresult: Double): WebErrorStatus
}

object IWebSocketErrorStatics {
  @scala.inline
  def apply(getStatus: Double => WebErrorStatus): IWebSocketErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
  
    __obj.asInstanceOf[IWebSocketErrorStatics]
  }
}

