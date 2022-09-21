package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothLEScan
  extends StObject
     with BluetoothLEScanOptions {
  
  var active: Boolean
  
  def stop(): Unit
}
object BluetoothLEScan {
  
  inline def apply(active: Boolean, stop: () => Unit): BluetoothLEScan = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[BluetoothLEScan]
  }
  
  extension [Self <: BluetoothLEScan](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
