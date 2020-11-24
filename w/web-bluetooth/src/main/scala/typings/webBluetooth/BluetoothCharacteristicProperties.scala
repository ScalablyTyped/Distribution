package typings.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothCharacteristicProperties extends js.Object {
  
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
    notify: Boolean,
    read: Boolean,
    reliableWrite: Boolean,
    writableAuxiliaries: Boolean,
    write: Boolean,
    writeWithoutResponse: Boolean
  ): BluetoothCharacteristicProperties = {
    val __obj = js.Dynamic.literal(authenticatedSignedWrites = authenticatedSignedWrites.asInstanceOf[js.Any], broadcast = broadcast.asInstanceOf[js.Any], indicate = indicate.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], reliableWrite = reliableWrite.asInstanceOf[js.Any], writableAuxiliaries = writableAuxiliaries.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any], writeWithoutResponse = writeWithoutResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothCharacteristicProperties]
  }
  
  @scala.inline
  implicit class BluetoothCharacteristicPropertiesOps[Self <: BluetoothCharacteristicProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticatedSignedWrites(value: Boolean): Self = this.set("authenticatedSignedWrites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcast(value: Boolean): Self = this.set("broadcast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicate(value: Boolean): Self = this.set("indicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReliableWrite(value: Boolean): Self = this.set("reliableWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableAuxiliaries(value: Boolean): Self = this.set("writableAuxiliaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: Boolean): Self = this.set("write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteWithoutResponse(value: Boolean): Self = this.set("writeWithoutResponse", value.asInstanceOf[js.Any])
  }
}
