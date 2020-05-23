package typings.winrtUwp.global.Windows.Devices.Bluetooth.GenericAttributeProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the desired security level. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel")
@js.native
object GattProtectionLevel extends js.Object {
  /* 1 */ val authenticationRequired: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel.authenticationRequired with Double = js.native
  /* 3 */ val encryptionAndAuthenticationRequired: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel.encryptionAndAuthenticationRequired with Double = js.native
  /* 2 */ val encryptionRequired: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel.encryptionRequired with Double = js.native
  /* 0 */ val plain: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel.plain with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel with Double
  ] = js.native
}

