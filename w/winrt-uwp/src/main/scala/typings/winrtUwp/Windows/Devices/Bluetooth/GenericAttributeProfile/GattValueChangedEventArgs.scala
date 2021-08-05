package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.std.Date
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value received when registering to receive notifications or indications from a Bluetooth LE device. */
trait GattValueChangedEventArgs extends StObject {
  
  /** Gets the new Characteristic Value. */
  var characteristicValue: IBuffer
  
  /** Gets the time at which the system was notified of the Characteristic Value change. */
  var timestamp: Date
}
object GattValueChangedEventArgs {
  
  inline def apply(characteristicValue: IBuffer, timestamp: Date): GattValueChangedEventArgs = {
    val __obj = js.Dynamic.literal(characteristicValue = characteristicValue.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattValueChangedEventArgs]
  }
  
  extension [Self <: GattValueChangedEventArgs](x: Self) {
    
    inline def setCharacteristicValue(value: IBuffer): Self = StObject.set(x, "characteristicValue", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
