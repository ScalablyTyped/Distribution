package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamSocketListenerControl extends js.Object {
  var qualityOfService: SocketQualityOfService
}

object IStreamSocketListenerControl {
  @scala.inline
  def apply(qualityOfService: SocketQualityOfService): IStreamSocketListenerControl = {
    val __obj = js.Dynamic.literal(qualityOfService = qualityOfService.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStreamSocketListenerControl]
  }
}

