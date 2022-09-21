package typings.w3cWebSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/serial/#dom-serialportrequestoptions */
trait SerialPortRequestOptions extends StObject {
  
  var filters: js.UndefOr[js.Array[SerialPortFilter]] = js.undefined
}
object SerialPortRequestOptions {
  
  inline def apply(): SerialPortRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerialPortRequestOptions]
  }
  
  extension [Self <: SerialPortRequestOptions](x: Self) {
    
    inline def setFilters(value: js.Array[SerialPortFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SerialPortFilter*): Self = StObject.set(x, "filters", js.Array(value*))
  }
}
