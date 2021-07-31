package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceUnpairingResultStatus extends StObject
/** The result of the unpairing action. */
@JSGlobal("Windows.Devices.Enumeration.DeviceUnpairingResultStatus")
@js.native
object DeviceUnpairingResultStatus extends StObject {
  
  /** The caller does not have sufficient permissions to unpair the device. */
  @js.native
  sealed trait accessDenied
    extends StObject
       with DeviceUnpairingResultStatus
  
  /** The device object was already unpaired. */
  @js.native
  sealed trait alreadyUnpaired
    extends StObject
       with DeviceUnpairingResultStatus
  
  /** An unknown failure occurred. */
  @js.native
  sealed trait failed
    extends StObject
       with DeviceUnpairingResultStatus
  
  /** The device object is currently in the middle of either a pairing or unpairing action. */
  @js.native
  sealed trait operationAlreadyInProgress
    extends StObject
       with DeviceUnpairingResultStatus
  
  /** The device object is successfully unpaired. */
  @js.native
  sealed trait unpaired
    extends StObject
       with DeviceUnpairingResultStatus
}
