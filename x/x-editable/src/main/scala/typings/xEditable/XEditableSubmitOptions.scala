package typings.xEditable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XEditableSubmitOptions extends StObject {
  
  var ajaxOptions: js.UndefOr[Any] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  def error(obj: Any): Unit
  
  def success(obj: Any, config: Any): Unit
  
  var url: js.UndefOr[Any] = js.undefined
}
object XEditableSubmitOptions {
  
  inline def apply(error: Any => Unit, success: (Any, Any) => Unit): XEditableSubmitOptions = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[XEditableSubmitOptions]
  }
  
  extension [Self <: XEditableSubmitOptions](x: Self) {
    
    inline def setAjaxOptions(value: Any): Self = StObject.set(x, "ajaxOptions", value.asInstanceOf[js.Any])
    
    inline def setAjaxOptionsUndefined: Self = StObject.set(x, "ajaxOptions", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (Any, Any) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
    
    inline def setUrl(value: Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
