package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputPaymentElementBaseSnake extends StObject {
  
  var element_id: js.UndefOr[String] = js.undefined
  
  // optional, called when the Element gains focus
  var on_blur: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  var on_change: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  var on_click: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  // optional, called on card payment success
  var on_error: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  // optional, called when the Element loses focus
  var on_escape: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  // optional, called when the Element is fully rendered
  var on_focus: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  // optional, called when the Element value changes
  var on_ready: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  // optional, called when the Element is clicked
  var on_success: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
}
object InputPaymentElementBaseSnake {
  
  inline def apply(): InputPaymentElementBaseSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputPaymentElementBaseSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputPaymentElementBaseSnake] (val x: Self) extends AnyVal {
    
    inline def setElement_id(value: String): Self = StObject.set(x, "element_id", value.asInstanceOf[js.Any])
    
    inline def setElement_idUndefined: Self = StObject.set(x, "element_id", js.undefined)
    
    inline def setOn_blur(value: /* event */ Any => Unit): Self = StObject.set(x, "on_blur", js.Any.fromFunction1(value))
    
    inline def setOn_blurUndefined: Self = StObject.set(x, "on_blur", js.undefined)
    
    inline def setOn_change(value: /* event */ Any => Unit): Self = StObject.set(x, "on_change", js.Any.fromFunction1(value))
    
    inline def setOn_changeUndefined: Self = StObject.set(x, "on_change", js.undefined)
    
    inline def setOn_click(value: /* event */ Any => Unit): Self = StObject.set(x, "on_click", js.Any.fromFunction1(value))
    
    inline def setOn_clickUndefined: Self = StObject.set(x, "on_click", js.undefined)
    
    inline def setOn_error(value: /* event */ Any => Unit): Self = StObject.set(x, "on_error", js.Any.fromFunction1(value))
    
    inline def setOn_errorUndefined: Self = StObject.set(x, "on_error", js.undefined)
    
    inline def setOn_escape(value: /* event */ Any => Unit): Self = StObject.set(x, "on_escape", js.Any.fromFunction1(value))
    
    inline def setOn_escapeUndefined: Self = StObject.set(x, "on_escape", js.undefined)
    
    inline def setOn_focus(value: /* event */ Any => Unit): Self = StObject.set(x, "on_focus", js.Any.fromFunction1(value))
    
    inline def setOn_focusUndefined: Self = StObject.set(x, "on_focus", js.undefined)
    
    inline def setOn_ready(value: /* event */ Any => Unit): Self = StObject.set(x, "on_ready", js.Any.fromFunction1(value))
    
    inline def setOn_readyUndefined: Self = StObject.set(x, "on_ready", js.undefined)
    
    inline def setOn_success(value: /* event */ Any => Unit): Self = StObject.set(x, "on_success", js.Any.fromFunction1(value))
    
    inline def setOn_successUndefined: Self = StObject.set(x, "on_success", js.undefined)
  }
}
