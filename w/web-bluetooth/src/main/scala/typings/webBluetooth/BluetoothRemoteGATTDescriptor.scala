package typings.webBluetooth

import typings.std.BufferSource
import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothRemoteGATTDescriptor extends StObject {
  
  val characteristic: BluetoothRemoteGATTCharacteristic
  
  def readValue(): js.Promise[DataView]
  
  val uuid: String
  
  val value: js.UndefOr[DataView] = js.undefined
  
  def writeValue(value: BufferSource): js.Promise[Unit]
}
object BluetoothRemoteGATTDescriptor {
  
  inline def apply(
    characteristic: BluetoothRemoteGATTCharacteristic,
    readValue: () => js.Promise[DataView],
    uuid: String,
    writeValue: BufferSource => js.Promise[Unit]
  ): BluetoothRemoteGATTDescriptor = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], readValue = js.Any.fromFunction0(readValue), uuid = uuid.asInstanceOf[js.Any], writeValue = js.Any.fromFunction1(writeValue))
    __obj.asInstanceOf[BluetoothRemoteGATTDescriptor]
  }
  
  extension [Self <: BluetoothRemoteGATTDescriptor](x: Self) {
    
    inline def setCharacteristic(value: BluetoothRemoteGATTCharacteristic): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setReadValue(value: () => js.Promise[DataView]): Self = StObject.set(x, "readValue", js.Any.fromFunction0(value))
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DataView): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWriteValue(value: BufferSource => js.Promise[Unit]): Self = StObject.set(x, "writeValue", js.Any.fromFunction1(value))
  }
}
