package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of an asynchronous read operation of a GATT Characteristic or Descriptor value. */
@js.native
trait GattReadResult extends StObject {
  
  /** Gets the status of an asynchronous operation. */
  var status: GattCommunicationStatus = js.native
  
  /** Gets the value read from the device. */
  var value: IBuffer = js.native
}
object GattReadResult {
  
  @scala.inline
  def apply(status: GattCommunicationStatus, value: IBuffer): GattReadResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattReadResult]
  }
  
  @scala.inline
  implicit class GattReadResultMutableBuilder[Self <: GattReadResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: GattCommunicationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: IBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
