package typings.xEditable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XEditableSubmitOptions extends StObject {
  
  var ajaxOptions: js.UndefOr[js.Any] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  def error(obj: js.Any): Unit = js.native
  
  def success(obj: js.Any, config: js.Any): Unit = js.native
  
  var url: js.UndefOr[js.Any] = js.native
}
object XEditableSubmitOptions {
  
  @scala.inline
  def apply(error: js.Any => Unit, success: (js.Any, js.Any) => Unit): XEditableSubmitOptions = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[XEditableSubmitOptions]
  }
  
  @scala.inline
  implicit class XEditableSubmitOptionsMutableBuilder[Self <: XEditableSubmitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjaxOptions(value: js.Any): Self = StObject.set(x, "ajaxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxOptionsUndefined: Self = StObject.set(x, "ajaxOptions", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUrl(value: js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
