package typings.swellJs

import typings.swellJs.anon.Phone
import typings.swellJs.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputPaymentElementGoogleSnake
  extends StObject
     with InputPaymentElementBaseSnake {
  
  var classes: js.UndefOr[`1`] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var require: js.UndefOr[Phone] = js.undefined
  
  var style: js.UndefOr[Any] = js.undefined
}
object InputPaymentElementGoogleSnake {
  
  inline def apply(): InputPaymentElementGoogleSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputPaymentElementGoogleSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputPaymentElementGoogleSnake] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: `1`): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setRequire(value: Phone): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
