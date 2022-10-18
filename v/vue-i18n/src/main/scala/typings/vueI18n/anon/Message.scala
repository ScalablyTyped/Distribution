package typings.vueI18n.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var datetime: js.UndefOr[Any] = js.undefined
  
  var message: js.UndefOr[Any] = js.undefined
  
  var number: js.UndefOr[Any] = js.undefined
}
object Message {
  
  inline def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setDatetime(value: Any): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNumber(value: Any): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
