package typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs

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
  sealed trait default extends DevicePairingProtectionLevel
  
  /** Pair the device using encryption. */
  @js.native
  sealed trait encryption extends DevicePairingProtectionLevel
  
  /** Pair the device using encryption and authentication. */
  @js.native
  sealed trait encryptionAndAuthentication extends DevicePairingProtectionLevel
  
  /** Pair the device using no levels of protection. */
  @js.native
  sealed trait none extends DevicePairingProtectionLevel
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DevicePairingProtectionLevel.default with Double = js.native
  /* 2 */ val encryption: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DevicePairingProtectionLevel.encryption with Double = js.native
  /* 3 */ val encryptionAndAuthentication: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DevicePairingProtectionLevel.encryptionAndAuthentication with Double = js.native
  /* 1 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DevicePairingProtectionLevel.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DevicePairingProtectionLevel with Double] = js.native
}

