package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs

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
  sealed trait associationEndpoint
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectDeviceSelectorType
  
  /** A device interface. */
  @js.native
  sealed trait deviceInterface
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectDeviceSelectorType
  
  val associationEndpoint: associationEndpoint with java.lang.String = js.native
  val deviceInterface: deviceInterface with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectDeviceSelectorType with java.lang.String
  ] = js.native
}

