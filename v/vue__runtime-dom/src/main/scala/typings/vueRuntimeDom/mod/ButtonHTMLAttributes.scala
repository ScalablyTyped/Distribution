package typings.vueRuntimeDom.mod

import typings.vueRuntimeDom.vueRuntimeDomStrings.button
import typings.vueRuntimeDom.vueRuntimeDomStrings.reset
import typings.vueRuntimeDom.vueRuntimeDomStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var autofocus: js.UndefOr[Booleanish] = js.undefined
  
  var disabled: js.UndefOr[Booleanish] = js.undefined
  
  var form: js.UndefOr[String] = js.undefined
  
  var formaction: js.UndefOr[String] = js.undefined
  
  var formenctype: js.UndefOr[String] = js.undefined
  
  var formmethod: js.UndefOr[String] = js.undefined
  
  var formnovalidate: js.UndefOr[Booleanish] = js.undefined
  
  var formtarget: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}
object ButtonHTMLAttributes {
  
  inline def apply(): ButtonHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonHTMLAttributes]
  }
  
  extension [Self <: ButtonHTMLAttributes](x: Self) {
    
    inline def setAutofocus(value: Booleanish): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    inline def setDisabled(value: Booleanish): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setFormaction(value: String): Self = StObject.set(x, "formaction", value.asInstanceOf[js.Any])
    
    inline def setFormactionUndefined: Self = StObject.set(x, "formaction", js.undefined)
    
    inline def setFormenctype(value: String): Self = StObject.set(x, "formenctype", value.asInstanceOf[js.Any])
    
    inline def setFormenctypeUndefined: Self = StObject.set(x, "formenctype", js.undefined)
    
    inline def setFormmethod(value: String): Self = StObject.set(x, "formmethod", value.asInstanceOf[js.Any])
    
    inline def setFormmethodUndefined: Self = StObject.set(x, "formmethod", js.undefined)
    
    inline def setFormnovalidate(value: Booleanish): Self = StObject.set(x, "formnovalidate", value.asInstanceOf[js.Any])
    
    inline def setFormnovalidateUndefined: Self = StObject.set(x, "formnovalidate", js.undefined)
    
    inline def setFormtarget(value: String): Self = StObject.set(x, "formtarget", value.asInstanceOf[js.Any])
    
    inline def setFormtargetUndefined: Self = StObject.set(x, "formtarget", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
