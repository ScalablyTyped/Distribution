package typings.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketActivityConnectedStandbyAction extends js.Object

/** Indicates whether an app that uses the socket brokering service can receive packets when the system goes to connected stand by. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityConnectedStandbyAction")
@js.native
object SocketActivityConnectedStandbyAction extends js.Object {
  /** The app should not receive packets when the system goes to stand by. */
  @js.native
  sealed trait doNotWake extends SocketActivityConnectedStandbyAction
  
  /** The app can receive packets even when the system goes to stand by. */
  @js.native
  sealed trait wake extends SocketActivityConnectedStandbyAction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketActivityConnectedStandbyAction with Double] = js.native
  /* 0 */ @js.native
  object doNotWake extends TopLevel[doNotWake with Double]
  
  /* 1 */ @js.native
  object wake extends TopLevel[wake with Double]
  
}

