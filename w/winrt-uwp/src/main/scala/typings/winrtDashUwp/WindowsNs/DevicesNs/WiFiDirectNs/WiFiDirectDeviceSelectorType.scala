package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs

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
  
  /* 1 */ val associationEndpoint: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectDeviceSelectorType.associationEndpoint with Double = js.native
  /* 0 */ val deviceInterface: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectDeviceSelectorType.deviceInterface with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectDeviceSelectorType with Double] = js.native
}

