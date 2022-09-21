package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reserve extends StObject {
  
  var reserve: js.UndefOr[String] = js.undefined
}
object Reserve {
  
  inline def apply(): Reserve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reserve]
  }
  
  extension [Self <: Reserve](x: Self) {
    
    inline def setReserve(value: String): Self = StObject.set(x, "reserve", value.asInstanceOf[js.Any])
    
    inline def setReserveUndefined: Self = StObject.set(x, "reserve", js.undefined)
  }
}
