package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkDeviceStatus extends StObject
/** Describes the readiness of a device to connect to a wireless network. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkDeviceStatus")
@js.native
object NetworkDeviceStatus extends StObject {
  
  /** A subscription account for the mobile broadband device is not active. */
  @js.native
  sealed trait accountNotActivated
    extends StObject
       with NetworkDeviceStatus
  
  /** The SIM card is not valid. This can occur when PIN Unblock Key attempts have exceeded the limit. */
  @js.native
  sealed trait badSim
    extends StObject
       with NetworkDeviceStatus
  
  /** The mobile broadband device is blocked by a PIN or password preventing the device from initializing and registering with a wireless network. */
  @js.native
  sealed trait deviceBlocked
    extends StObject
       with NetworkDeviceStatus
  
  /** The mobile broadband device hardware is not responding. */
  @js.native
  sealed trait deviceHardwareFailure
    extends StObject
       with NetworkDeviceStatus
  
  /** The mobile broadband device is locked by a PIN or password preventing the device from initializing and registering with a wireless network. */
  @js.native
  sealed trait deviceLocked
    extends StObject
       with NetworkDeviceStatus
  
  /** The mobile broadband device is off. */
  @js.native
  sealed trait deviceNotReady
    extends StObject
       with NetworkDeviceStatus
  
  /** The device is powered on and ready for mobile broadband operations. */
  @js.native
  sealed trait deviceReady
    extends StObject
       with NetworkDeviceStatus
  
  /** The mobile broadband device does not have a SIM card. */
  @js.native
  sealed trait simNotInserted
    extends StObject
       with NetworkDeviceStatus
}
