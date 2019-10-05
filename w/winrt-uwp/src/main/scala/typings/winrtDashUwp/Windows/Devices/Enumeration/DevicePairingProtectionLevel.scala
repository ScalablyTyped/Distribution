package typings.winrtDashUwp.Windows.Devices.Enumeration

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
  
  /* 0 */ val default: typings.winrtDashUwp.Windows.Devices.Enumeration.DevicePairingProtectionLevel.default with Double = js.native
  /* 2 */ val encryption: typings.winrtDashUwp.Windows.Devices.Enumeration.DevicePairingProtectionLevel.encryption with Double = js.native
  /* 3 */ val encryptionAndAuthentication: typings.winrtDashUwp.Windows.Devices.Enumeration.DevicePairingProtectionLevel.encryptionAndAuthentication with Double = js.native
  /* 1 */ val none: typings.winrtDashUwp.Windows.Devices.Enumeration.DevicePairingProtectionLevel.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DevicePairingProtectionLevel with Double] = js.native
}

