package typings.webBluetooth

import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothDataFilter extends StObject {
  
  val dataPrefix: js.UndefOr[BufferSource] = js.undefined
  
  val mask: js.UndefOr[BufferSource] = js.undefined
}
object BluetoothDataFilter {
  
  inline def apply(): BluetoothDataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BluetoothDataFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BluetoothDataFilter] (val x: Self) extends AnyVal {
    
    inline def setDataPrefix(value: BufferSource): Self = StObject.set(x, "dataPrefix", value.asInstanceOf[js.Any])
    
    inline def setDataPrefixUndefined: Self = StObject.set(x, "dataPrefix", js.undefined)
    
    inline def setMask(value: BufferSource): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
