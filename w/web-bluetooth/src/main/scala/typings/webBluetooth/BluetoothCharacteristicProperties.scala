package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothCharacteristicProperties extends StObject {
  
  val authenticatedSignedWrites: Boolean = js.native
  
  val broadcast: Boolean = js.native
  
  val indicate: Boolean = js.native
  
  @JSName("notify")
  val notify_FBluetoothCharacteristicProperties: Boolean = js.native
  
  val read: Boolean = js.native
  
  val reliableWrite: Boolean = js.native
  
  val writableAuxiliaries: Boolean = js.native
  
  val write: Boolean = js.native
  
  val writeWithoutResponse: Boolean = js.native
}
object BluetoothCharacteristicProperties {
  
  @scala.inline
  def apply(
    authenticatedSignedWrites: Boolean,
    broadcast: Boolean,
    indicate: Boolean,
    notify_ : Boolean,
    read: Boolean,
    reliableWrite: Boolean,
    writableAuxiliaries: Boolean,
    write: Boolean,
    writeWithoutResponse: Boolean
  ): BluetoothCharacteristicProperties = {
    val __obj = js.Dynamic.literal(authenticatedSignedWrites = authenticatedSignedWrites.asInstanceOf[js.Any], broadcast = broadcast.asInstanceOf[js.Any], indicate = indicate.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], reliableWrite = reliableWrite.asInstanceOf[js.Any], writableAuxiliaries = writableAuxiliaries.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any], writeWithoutResponse = writeWithoutResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothCharacteristicProperties]
  }
  
  @scala.inline
  implicit class BluetoothCharacteristicPropertiesMutableBuilder[Self <: BluetoothCharacteristicProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatedSignedWrites(value: Boolean): Self = StObject.set(x, "authenticatedSignedWrites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcast(value: Boolean): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicate(value: Boolean): Self = StObject.set(x, "indicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReliableWrite(value: Boolean): Self = StObject.set(x, "reliableWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableAuxiliaries(value: Boolean): Self = StObject.set(x, "writableAuxiliaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteWithoutResponse(value: Boolean): Self = StObject.set(x, "writeWithoutResponse", value.asInstanceOf[js.Any])
  }
}
