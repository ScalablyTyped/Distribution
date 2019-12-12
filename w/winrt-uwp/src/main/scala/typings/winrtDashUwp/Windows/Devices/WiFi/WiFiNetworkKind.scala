package typings.winrtDashUwp.Windows.Devices.WiFi

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.WiFi.WiFiNetworkKind.adhoc
import typings.winrtDashUwp.Windows.Devices.WiFi.WiFiNetworkKind.any
import typings.winrtDashUwp.Windows.Devices.WiFi.WiFiNetworkKind.infrastructure
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiNetworkKind with Double] = js.native
  /* 2 */ @js.native
  object adhoc extends TopLevel[adhoc with Double]
  
  /* 0 */ @js.native
  object any extends TopLevel[any with Double]
  
  /* 1 */ @js.native
  object infrastructure extends TopLevel[infrastructure with Double]
  
}

