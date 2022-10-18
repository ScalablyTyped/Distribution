package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxSelectElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var autocomplete: js.UndefOr[String] = js.undefined
  
  var autofocus: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var form: js.UndefOr[String] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object JsxSelectElementProps {
  
  inline def apply(): JsxSelectElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxSelectElementProps]
  }
  
  extension [Self <: JsxSelectElementProps](x: Self) {
    
    inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
