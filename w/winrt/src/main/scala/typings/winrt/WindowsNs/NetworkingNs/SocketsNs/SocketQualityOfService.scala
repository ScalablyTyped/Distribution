package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketQualityOfService extends js.Object

@JSGlobal("Windows.Networking.Sockets.SocketQualityOfService")
@js.native
object SocketQualityOfService extends js.Object {
  @js.native
  sealed trait lowLatency extends SocketQualityOfService
  
  @js.native
  sealed trait normal extends SocketQualityOfService
  
  /* 1 */ val lowLatency: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketQualityOfService.lowLatency with Double = js.native
  /* 0 */ val normal: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketQualityOfService.normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketQualityOfService with Double] = js.native
}

