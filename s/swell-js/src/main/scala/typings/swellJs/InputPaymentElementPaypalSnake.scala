package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputPaymentElementPaypalSnake
  extends StObject
     with InputPaymentElementBaseSnake {
  
  var style: js.UndefOr[Any] = js.undefined
}
object InputPaymentElementPaypalSnake {
  
  inline def apply(): InputPaymentElementPaypalSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputPaymentElementPaypalSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputPaymentElementPaypalSnake] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
