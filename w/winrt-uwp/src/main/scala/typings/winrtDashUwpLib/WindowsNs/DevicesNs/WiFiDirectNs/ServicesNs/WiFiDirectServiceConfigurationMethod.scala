package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectServiceConfigurationMethod extends js.Object

/** Values describing how service configuration is performed when a session is being established. Typically, either no input is required, or one device in the session displays a PIN and the other device requires that the PIN be entered. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod")
@js.native
object WiFiDirectServiceConfigurationMethod extends js.Object {
  /** Do not require input at configuration. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceConfigurationMethod
  
  /** Display a PIN at configuration. */
  @js.native
  sealed trait pinDisplay
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceConfigurationMethod
  
  /** Request PIN entry at configuration. */
  @js.native
  sealed trait pinEntry
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceConfigurationMethod
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val pinDisplay: pinDisplay with scala.Double = js.native
  /* 2 */ val pinEntry: pinEntry with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceConfigurationMethod with scala.Double
  ] = js.native
}

