package typings.webBluetooth

import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothDataFilter extends StObject {
  
  val dataPrefix: DataView
  
  val mask: DataView
}
object BluetoothDataFilter {
  
  inline def apply(dataPrefix: DataView, mask: DataView): BluetoothDataFilter = {
    val __obj = js.Dynamic.literal(dataPrefix = dataPrefix.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDataFilter]
  }
  
  extension [Self <: BluetoothDataFilter](x: Self) {
    
    inline def setDataPrefix(value: DataView): Self = StObject.set(x, "dataPrefix", value.asInstanceOf[js.Any])
    
    inline def setMask(value: DataView): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
