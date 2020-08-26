package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamSocketListenerControl extends js.Object {
  var qualityOfService: SocketQualityOfService = js.native
}

object IStreamSocketListenerControl {
  @scala.inline
  def apply(qualityOfService: SocketQualityOfService): IStreamSocketListenerControl = {
    val __obj = js.Dynamic.literal(qualityOfService = qualityOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamSocketListenerControl]
  }
  @scala.inline
  implicit class IStreamSocketListenerControlOps[Self <: IStreamSocketListenerControl] (val x: Self) extends AnyVal {
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
    def setQualityOfService(value: SocketQualityOfService): Self = this.set("qualityOfService", value.asInstanceOf[js.Any])
  }
  
}

