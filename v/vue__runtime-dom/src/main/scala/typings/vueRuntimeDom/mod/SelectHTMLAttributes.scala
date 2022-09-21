package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var autocomplete: js.UndefOr[String] = js.undefined
  
  var autofocus: js.UndefOr[Booleanish] = js.undefined
  
  var disabled: js.UndefOr[Booleanish] = js.undefined
  
  var form: js.UndefOr[String] = js.undefined
  
  var multiple: js.UndefOr[Booleanish] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Booleanish] = js.undefined
  
  var size: js.UndefOr[Numberish] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object SelectHTMLAttributes {
  
  inline def apply(): SelectHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectHTMLAttributes]
  }
  
  extension [Self <: SelectHTMLAttributes](x: Self) {
    
    inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    inline def setAutofocus(value: Booleanish): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    inline def setDisabled(value: Booleanish): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setMultiple(value: Booleanish): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequired(value: Booleanish): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSize(value: Numberish): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
