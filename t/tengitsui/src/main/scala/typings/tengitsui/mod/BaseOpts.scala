package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseOpts extends StObject {
  
  var disabled: js.UndefOr[Boolean | (js.Function1[/* fields */ Fields, Boolean])] = js.undefined
  
  var handleChange: js.UndefOr[js.Function2[/* value */ Any, /* onChange */ onChange, Any]] = js.undefined
}
object BaseOpts {
  
  inline def apply(): BaseOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOpts]
  }
  
  extension [Self <: BaseOpts](x: Self) {
    
    inline def setDisabled(value: Boolean | (js.Function1[/* fields */ Fields, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledFunction1(value: /* fields */ Fields => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHandleChange(value: (/* value */ Any, /* onChange */ onChange) => Any): Self = StObject.set(x, "handleChange", js.Any.fromFunction2(value))
    
    inline def setHandleChangeUndefined: Self = StObject.set(x, "handleChange", js.undefined)
  }
}
