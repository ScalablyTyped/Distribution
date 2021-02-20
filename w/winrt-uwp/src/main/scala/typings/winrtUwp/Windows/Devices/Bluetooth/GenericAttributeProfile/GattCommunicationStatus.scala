package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GattCommunicationStatus extends StObject
/** Represents the return status of a WinRT GATT API related Async operation. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCommunicationStatus")
@js.native
object GattCommunicationStatus extends StObject {
  
  /** The operation completed successfully. */
  @js.native
  sealed trait success extends GattCommunicationStatus
  
  /** No communication can be performed with the device, at this time. */
  @js.native
  sealed trait unreachable extends GattCommunicationStatus
}
