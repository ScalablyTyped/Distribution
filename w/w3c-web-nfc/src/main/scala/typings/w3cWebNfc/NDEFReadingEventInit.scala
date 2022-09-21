package typings.w3cWebNfc

import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NDEFReadingEventInit
  extends StObject
     with EventInit {
  
  var message: NDEFMessageInit
  
  var serialNumber: js.UndefOr[String] = js.undefined
}
object NDEFReadingEventInit {
  
  inline def apply(message: NDEFMessageInit): NDEFReadingEventInit = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[NDEFReadingEventInit]
  }
  
  extension [Self <: NDEFReadingEventInit](x: Self) {
    
    inline def setMessage(value: NDEFMessageInit): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
