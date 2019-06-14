package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectConfigurationMethod extends js.Object

/** Specifies a Wi-Fi Direct configuration method. Configuration is how a user tells one piece of Wi-Fi Direct equipment to connect to another piece of Wi-Fi Direct equipment. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod")
@js.native
object WiFiDirectConfigurationMethod extends js.Object {
  /** This device accepts connections from devices that provide the PIN this device currently displays. */
  @js.native
  sealed trait displayPin
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectConfigurationMethod
  
  /** This device accepts entry of the PIN being displayed on the accepting device. */
  @js.native
  sealed trait providePin
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectConfigurationMethod
  
  /** This device uses the pushbutton method for pairing. A user pushes a button on both the connecting device and the accepting device in order to establish a connection between them. */
  @js.native
  sealed trait pushButton
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectConfigurationMethod
  
  /* 1 */ val displayPin: displayPin with scala.Double = js.native
  /* 0 */ val providePin: providePin with scala.Double = js.native
  /* 2 */ val pushButton: pushButton with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectConfigurationMethod with scala.Double
  ] = js.native
}

