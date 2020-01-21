package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GattProtectionLevel with Double] = js.native
  /* 1 */ @js.native
  object authenticationRequired extends TopLevel[authenticationRequired with Double]
  
  /* 3 */ @js.native
  object encryptionAndAuthenticationRequired extends TopLevel[encryptionAndAuthenticationRequired with Double]
  
  /* 2 */ @js.native
  object encryptionRequired extends TopLevel[encryptionRequired with Double]
  
  /* 0 */ @js.native
  object plain extends TopLevel[plain with Double]
  
}

