package typings.winrtUwp.Windows.Devices.WiFi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiNetworkKind extends StObject
/** Describes the kinds of Wi-Fi networks. */
@JSGlobal("Windows.Devices.WiFi.WiFiNetworkKind")
@js.native
object WiFiNetworkKind extends StObject {
  
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
