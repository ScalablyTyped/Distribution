package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISocketErrorStatics extends js.Object {
  def getStatus(hresult: Double): SocketErrorStatus = js.native
}

object ISocketErrorStatics {
  @scala.inline
  def apply(getStatus: Double => SocketErrorStatus): ISocketErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[ISocketErrorStatics]
  }
  @scala.inline
  implicit class ISocketErrorStaticsOps[Self <: ISocketErrorStatics] (val x: Self) extends AnyVal {
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
    def setGetStatus(value: Double => SocketErrorStatus): Self = this.set("getStatus", js.Any.fromFunction1(value))
  }
  
}

