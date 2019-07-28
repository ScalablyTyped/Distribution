package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamSocketListenerControl extends js.Object {
  var qualityOfService: SocketQualityOfService
}

object IStreamSocketListenerControl {
  @scala.inline
  def apply(qualityOfService: SocketQualityOfService): IStreamSocketListenerControl = {
    val __obj = js.Dynamic.literal(qualityOfService = qualityOfService)
  
    __obj.asInstanceOf[IStreamSocketListenerControl]
  }
}

