package typings.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about the result of attempting to pair a device. */
@JSGlobal("Windows.Devices.Enumeration.DevicePairingResult")
@js.native
abstract class DevicePairingResult ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingResult {
  
  /** Gets the level of protection used to pair the device. */
  /* CompleteClass */
  var protectionLevelUsed: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingProtectionLevel = js.native
  
  /** Gets the paired status of the device after the pairing action completed. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingResultStatus = js.native
}
