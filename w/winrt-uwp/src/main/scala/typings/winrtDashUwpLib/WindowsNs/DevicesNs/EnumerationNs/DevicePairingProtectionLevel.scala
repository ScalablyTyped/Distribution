package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DevicePairingProtectionLevel extends js.Object

/** The level of protection for pairing. */
@JSGlobal("Windows.Devices.Enumeration.DevicePairingProtectionLevel")
@js.native
object DevicePairingProtectionLevel extends js.Object {
  /** The default value. This should not be used. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingProtectionLevel
  
  /** Pair the device using encryption. */
  @js.native
  sealed trait encryption
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingProtectionLevel
  
  /** Pair the device using encryption and authentication. */
  @js.native
  sealed trait encryptionAndAuthentication
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingProtectionLevel
  
  /** Pair the device using no levels of protection. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingProtectionLevel
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 2 */ val encryption: encryption with scala.Double = js.native
  /* 3 */ val encryptionAndAuthentication: encryptionAndAuthentication with scala.Double = js.native
  /* 1 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingProtectionLevel with scala.Double
  ] = js.native
}

