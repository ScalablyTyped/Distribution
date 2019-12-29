package typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectServiceIPProtocol extends js.Object

/** Values that specify the IP protocol of the new port when a WiFiDirectServiceSession.RemotePortAdded event is raised. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol")
@js.native
object WiFiDirectServiceIPProtocol extends js.Object {
  /** TCP */
  @js.native
  sealed trait tcp extends WiFiDirectServiceIPProtocol
  
  /** UDP */
  @js.native
  sealed trait udp extends WiFiDirectServiceIPProtocol
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectServiceIPProtocol with Double] = js.native
  /* 0 */ @js.native
  object tcp extends TopLevel[tcp with Double]
  
  /* 1 */ @js.native
  object udp extends TopLevel[udp with Double]
  
}

