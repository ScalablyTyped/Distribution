package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DevicePairingProtectionLevel extends StObject
/** The level of protection for pairing. */
@JSGlobal("Windows.Devices.Enumeration.DevicePairingProtectionLevel")
@js.native
object DevicePairingProtectionLevel extends StObject {
  
  /** The default value. This should not be used. */
  @js.native
  sealed trait default
    extends StObject
       with DevicePairingProtectionLevel
  
  /** Pair the device using encryption. */
  @js.native
  sealed trait encryption
    extends StObject
       with DevicePairingProtectionLevel
  
  /** Pair the device using encryption and authentication. */
  @js.native
  sealed trait encryptionAndAuthentication
    extends StObject
       with DevicePairingProtectionLevel
  
  /** Pair the device using no levels of protection. */
  @js.native
  sealed trait none
    extends StObject
       with DevicePairingProtectionLevel
}
