package typings.swellJs

import typings.swellJs.anon.Base
import typings.swellJs.anon.Email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputPaymentElementAppleSnake
  extends StObject
     with InputPaymentElementBaseSnake {
  
  var classes: js.UndefOr[Base] = js.undefined
  
  var require: js.UndefOr[Email] = js.undefined
  
  var style: js.UndefOr[Any] = js.undefined
}
object InputPaymentElementAppleSnake {
  
  inline def apply(): InputPaymentElementAppleSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputPaymentElementAppleSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputPaymentElementAppleSnake] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: Base): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setRequire(value: Email): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
