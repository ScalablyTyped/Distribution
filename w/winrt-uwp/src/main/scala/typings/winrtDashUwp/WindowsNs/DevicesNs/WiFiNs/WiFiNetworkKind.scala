package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiNetworkKind extends js.Object

/** Describes the kinds of Wi-Fi networks. */
@JSGlobal("Windows.Devices.WiFi.WiFiNetworkKind")
@js.native
object WiFiNetworkKind extends js.Object {
  /** An independent (IBSS) network. */
  @js.native
  sealed trait adhoc extends WiFiNetworkKind
  
  /** Either an infrastructure or independent network. */
  @js.native
  sealed trait any extends WiFiNetworkKind
  
  /** An infrastructure network. */
  @js.native
  sealed trait infrastructure extends WiFiNetworkKind
  
  /* 2 */ val adhoc: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiNs.WiFiNetworkKind.adhoc with Double = js.native
  /* 0 */ val any: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiNs.WiFiNetworkKind.any with Double = js.native
  /* 1 */ val infrastructure: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiNs.WiFiNetworkKind.infrastructure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiNetworkKind with Double] = js.native
}

