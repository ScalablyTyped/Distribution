package typings.swellJs

import typings.swellJs.anon.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputPaymentElementIdealSnake
  extends StObject
     with InputPaymentElementBaseSnake {
  
  var options: js.UndefOr[Style] = js.undefined
}
object InputPaymentElementIdealSnake {
  
  inline def apply(): InputPaymentElementIdealSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputPaymentElementIdealSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputPaymentElementIdealSnake] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: Style): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
