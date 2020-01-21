package typings.winrtUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectConnectionStatus extends js.Object

/** Describes the connection status of a WiFiDirectDevice object. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionStatus")
@js.native
object WiFiDirectConnectionStatus extends js.Object {
  /** The device is connected to an associated Wi-Fi Direct device. */
  @js.native
  sealed trait connected extends WiFiDirectConnectionStatus
  
  /** The device is not connected. */
  @js.native
  sealed trait disconnected extends WiFiDirectConnectionStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectConnectionStatus with Double] = js.native
  /* 1 */ @js.native
  object connected extends TopLevel[connected with Double]
  
  /* 0 */ @js.native
  object disconnected extends TopLevel[disconnected with Double]
  
}

