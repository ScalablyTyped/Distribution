package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceAccessStatus extends StObject
/** Indicates the status of the access to a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessStatus")
@js.native
object DeviceAccessStatus extends StObject {
  
  /** Access to the device is allowed. */
  @js.native
  sealed trait allowed
    extends StObject
       with DeviceAccessStatus
  
  /** Access to the device has been disallowed by the system. */
  @js.native
  sealed trait deniedBySystem
    extends StObject
       with DeviceAccessStatus
  
  /** Access to the device has been disallowed by the user. */
  @js.native
  sealed trait deniedByUser
    extends StObject
       with DeviceAccessStatus
  
  /** The device access is not specified. */
  @js.native
  sealed trait unspecified
    extends StObject
       with DeviceAccessStatus
}
