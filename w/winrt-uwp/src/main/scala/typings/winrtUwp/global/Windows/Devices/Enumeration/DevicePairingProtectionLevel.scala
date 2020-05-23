package typings.winrtUwp.global.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The level of protection for pairing. */
@JSGlobal("Windows.Devices.Enumeration.DevicePairingProtectionLevel")
@js.native
object DevicePairingProtectionLevel extends js.Object {
  /* 0 */ val default: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingProtectionLevel.default with Double = js.native
  /* 2 */ val encryption: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingProtectionLevel.encryption with Double = js.native
  /* 3 */ val encryptionAndAuthentication: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingProtectionLevel.encryptionAndAuthentication with Double = js.native
  /* 1 */ val none: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingProtectionLevel.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingProtectionLevel with Double
  ] = js.native
}

