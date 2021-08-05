package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of an asynchronous read operation of a GATT Characteristic or Descriptor value. */
trait GattReadResult extends StObject {
  
  /** Gets the status of an asynchronous operation. */
  var status: GattCommunicationStatus
  
  /** Gets the value read from the device. */
  var value: IBuffer
}
object GattReadResult {
  
  inline def apply(status: GattCommunicationStatus, value: IBuffer): GattReadResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattReadResult]
  }
  
  extension [Self <: GattReadResult](x: Self) {
    
    inline def setStatus(value: GattCommunicationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: IBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
