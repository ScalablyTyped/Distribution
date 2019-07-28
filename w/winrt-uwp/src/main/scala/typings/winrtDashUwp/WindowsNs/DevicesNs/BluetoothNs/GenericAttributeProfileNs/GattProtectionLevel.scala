package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GattProtectionLevel extends js.Object

/** Represents the desired security level. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel")
@js.native
object GattProtectionLevel extends js.Object {
  /** Require the link to be authenticated. */
  @js.native
  sealed trait authenticationRequired extends GattProtectionLevel
  
  /** Require the link to be encrypted and authenticated. */
  @js.native
  sealed trait encryptionAndAuthenticationRequired extends GattProtectionLevel
  
  /** Require the link to be encrypted. */
  @js.native
  sealed trait encryptionRequired extends GattProtectionLevel
  
  /** Uses the default protection level. */
  @js.native
  sealed trait plain extends GattProtectionLevel
  
  /* 1 */ val authenticationRequired: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattProtectionLevel.authenticationRequired with Double = js.native
  /* 3 */ val encryptionAndAuthenticationRequired: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattProtectionLevel.encryptionAndAuthenticationRequired with Double = js.native
  /* 2 */ val encryptionRequired: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattProtectionLevel.encryptionRequired with Double = js.native
  /* 0 */ val plain: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattProtectionLevel.plain with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GattProtectionLevel with Double] = js.native
}

