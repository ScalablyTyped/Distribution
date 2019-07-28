package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiNs

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
  sealed trait automatic extends WiFiReconnectionKind
  
  /** Allow user to reconnect manually. */
  @js.native
  sealed trait manual extends WiFiReconnectionKind
  
  /* 0 */ val automatic: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiNs.WiFiReconnectionKind.automatic with Double = js.native
  /* 1 */ val manual: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiNs.WiFiReconnectionKind.manual with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiReconnectionKind with Double] = js.native
}

