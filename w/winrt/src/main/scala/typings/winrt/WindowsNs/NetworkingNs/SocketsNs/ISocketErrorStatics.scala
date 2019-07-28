package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISocketErrorStatics extends js.Object {
  def getStatus(hresult: Double): SocketErrorStatus
}

object ISocketErrorStatics {
  @scala.inline
  def apply(getStatus: Double => SocketErrorStatus): ISocketErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
  
    __obj.asInstanceOf[ISocketErrorStatics]
  }
}

