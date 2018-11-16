package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs

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
  sealed trait authenticationRequired
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattProtectionLevel
  
  /** Require the link to be encrypted and authenticated. */
  @js.native
  sealed trait encryptionAndAuthenticationRequired
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattProtectionLevel
  
  /** Require the link to be encrypted. */
  @js.native
  sealed trait encryptionRequired
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattProtectionLevel
  
  /** Uses the default protection level. */
  @js.native
  sealed trait plain
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattProtectionLevel
  
  val authenticationRequired: authenticationRequired with java.lang.String = js.native
  val encryptionAndAuthenticationRequired: encryptionAndAuthenticationRequired with java.lang.String = js.native
  val encryptionRequired: encryptionRequired with java.lang.String = js.native
  val plain: plain with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattProtectionLevel with java.lang.String
  ] = js.native
}

