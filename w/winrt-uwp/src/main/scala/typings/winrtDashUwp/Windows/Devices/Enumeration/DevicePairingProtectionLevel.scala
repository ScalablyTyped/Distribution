package typings.winrtDashUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DevicePairingProtectionLevel with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 2 */ @js.native
  object encryption extends TopLevel[encryption with Double]
  
  /* 3 */ @js.native
  object encryptionAndAuthentication extends TopLevel[encryptionAndAuthentication with Double]
  
  /* 1 */ @js.native
  object none extends TopLevel[none with Double]
  
}

