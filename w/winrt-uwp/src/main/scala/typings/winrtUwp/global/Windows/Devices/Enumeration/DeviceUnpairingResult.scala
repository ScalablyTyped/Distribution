package typings.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about the result of attempting to unpair a device. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Enumeration.DeviceUnpairingResult")
@js.native
open class DeviceUnpairingResult ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Enumeration.DeviceUnpairingResult {
  
  /** Gets the paired status of the device after the unpairing action completed. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.Devices.Enumeration.DeviceUnpairingResultStatus = js.native
}
