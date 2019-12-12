package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Networking.Sockets.SocketQualityOfService.lowLatency
import typings.winrt.Windows.Networking.Sockets.SocketQualityOfService.normal
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketQualityOfService with Double] = js.native
  /* 1 */ @js.native
  object lowLatency extends TopLevel[lowLatency with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
}

