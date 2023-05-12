package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputPaymentRedirectSnake extends StObject {
  
  // optional, called on card payment success
  var on_error: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  var on_success: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
}
object InputPaymentRedirectSnake {
  
  inline def apply(): InputPaymentRedirectSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputPaymentRedirectSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputPaymentRedirectSnake] (val x: Self) extends AnyVal {
    
    inline def setOn_error(value: /* event */ Any => Unit): Self = StObject.set(x, "on_error", js.Any.fromFunction1(value))
    
    inline def setOn_errorUndefined: Self = StObject.set(x, "on_error", js.undefined)
    
    inline def setOn_success(value: /* event */ Any => Unit): Self = StObject.set(x, "on_success", js.Any.fromFunction1(value))
    
    inline def setOn_successUndefined: Self = StObject.set(x, "on_success", js.undefined)
  }
}
