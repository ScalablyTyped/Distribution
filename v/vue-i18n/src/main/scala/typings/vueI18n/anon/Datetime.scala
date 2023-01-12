package typings.vueI18n.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datetime extends StObject {
  
  var datetime: js.UndefOr[Any] = js.undefined
  
  var message: js.UndefOr[Any] = js.undefined
  
  var number: js.UndefOr[Any] = js.undefined
}
object Datetime {
  
  inline def apply(): Datetime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datetime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Datetime] (val x: Self) extends AnyVal {
    
    inline def setDatetime(value: Any): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNumber(value: Any): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
