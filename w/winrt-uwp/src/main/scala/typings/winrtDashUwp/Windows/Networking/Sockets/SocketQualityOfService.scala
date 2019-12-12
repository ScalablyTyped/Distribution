package typings.winrtDashUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.Sockets.SocketQualityOfService.lowLatency
import typings.winrtDashUwp.Windows.Networking.Sockets.SocketQualityOfService.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketQualityOfService extends js.Object

/** Specifies the quality of service for a DatagramSocket or StreamSocket object. */
@JSGlobal("Windows.Networking.Sockets.SocketQualityOfService")
@js.native
object SocketQualityOfService extends js.Object {
  /** Low latency quality of service commonly used for audio. */
  @js.native
  sealed trait lowLatency extends SocketQualityOfService
  
  /** Normal quality of service. */
  @js.native
  sealed trait normal extends SocketQualityOfService
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketQualityOfService with Double] = js.native
  /* 1 */ @js.native
  object lowLatency extends TopLevel[lowLatency with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
}

