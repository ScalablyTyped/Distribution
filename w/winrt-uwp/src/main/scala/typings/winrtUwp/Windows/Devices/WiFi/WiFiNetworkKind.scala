package typings.winrtUwp.Windows.Devices.WiFi

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
  
}

