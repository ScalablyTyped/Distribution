package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothLEScan
  extends StObject
     with RequestLEScanOptions {
  
  var active: Boolean
  
  def stop(): Unit
}
object BluetoothLEScan {
  
  @scala.inline
  def apply(active: Boolean, stop: () => Unit): BluetoothLEScan = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[BluetoothLEScan]
  }
  
  @scala.inline
  implicit class BluetoothLEScanMutableBuilder[Self <: BluetoothLEScan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
