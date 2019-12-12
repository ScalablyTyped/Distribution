package typings.winrtDashUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType.associationEndpoint
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType.deviceInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectDeviceSelectorType extends js.Object

/** Specifies the device selector type for Wi-Fi Direct. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType")
@js.native
object WiFiDirectDeviceSelectorType extends js.Object {
  /** An associated endpoint. This includes other PC, tablets, and phones. */
  @js.native
  sealed trait associationEndpoint extends WiFiDirectDeviceSelectorType
  
  /** A device interface. */
  @js.native
  sealed trait deviceInterface extends WiFiDirectDeviceSelectorType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectDeviceSelectorType with Double] = js.native
  /* 1 */ @js.native
  object associationEndpoint extends TopLevel[associationEndpoint with Double]
  
  /* 0 */ @js.native
  object deviceInterface extends TopLevel[deviceInterface with Double]
  
}

