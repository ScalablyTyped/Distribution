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
  
  val default: default with java.lang.String = js.native
  val encryption: encryption with java.lang.String = js.native
  val encryptionAndAuthentication: encryptionAndAuthentication with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingProtectionLevel with java.lang.String
  ] = js.native
}

