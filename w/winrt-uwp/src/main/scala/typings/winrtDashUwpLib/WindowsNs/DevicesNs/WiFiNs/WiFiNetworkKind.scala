package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs

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
  sealed trait adhoc
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiNetworkKind
  
  /** Either an infrastructure or independent network. */
  @js.native
  sealed trait any
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiNetworkKind
  
  /** An infrastructure network. */
  @js.native
  sealed trait infrastructure
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiNetworkKind
  
  val adhoc: adhoc with java.lang.String = js.native
  val any: any with java.lang.String = js.native
  val infrastructure: infrastructure with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiNetworkKind with java.lang.String] = js.native
}

