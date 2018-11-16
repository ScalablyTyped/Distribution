package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiReconnectionKind extends js.Object

/** Describes whether to automatically reconnect to this network. */
@JSGlobal("Windows.Devices.WiFi.WiFiReconnectionKind")
@js.native
object WiFiReconnectionKind extends js.Object {
  /** Reconnect automatically. */
  @js.native
  sealed trait automatic
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiReconnectionKind
  
  /** Allow user to reconnect manually. */
  @js.native
  sealed trait manual
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiReconnectionKind
  
  val automatic: automatic with java.lang.String = js.native
  val manual: manual with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiReconnectionKind with java.lang.String
  ] = js.native
}

