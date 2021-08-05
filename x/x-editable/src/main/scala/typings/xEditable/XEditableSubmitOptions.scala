package typings.xEditable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XEditableSubmitOptions extends StObject {
  
  var ajaxOptions: js.UndefOr[js.Any] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  def error(obj: js.Any): Unit
  
  def success(obj: js.Any, config: js.Any): Unit
  
  var url: js.UndefOr[js.Any] = js.undefined
}
object XEditableSubmitOptions {
  
  inline def apply(error: js.Any => Unit, success: (js.Any, js.Any) => Unit): XEditableSubmitOptions = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[XEditableSubmitOptions]
  }
  
  extension [Self <: XEditableSubmitOptions](x: Self) {
    
    inline def setAjaxOptions(value: js.Any): Self = StObject.set(x, "ajaxOptions", value.asInstanceOf[js.Any])
    
    inline def setAjaxOptionsUndefined: Self = StObject.set(x, "ajaxOptions", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
    
    inline def setUrl(value: js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
