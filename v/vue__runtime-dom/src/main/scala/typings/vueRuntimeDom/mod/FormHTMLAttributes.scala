package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var acceptcharset: js.UndefOr[String] = js.undefined
  
  var action: js.UndefOr[String] = js.undefined
  
  var autocomplete: js.UndefOr[String] = js.undefined
  
  var enctype: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var novalidate: js.UndefOr[Booleanish] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object FormHTMLAttributes {
  
  inline def apply(): FormHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormHTMLAttributes]
  }
  
  extension [Self <: FormHTMLAttributes](x: Self) {
    
    inline def setAcceptcharset(value: String): Self = StObject.set(x, "acceptcharset", value.asInstanceOf[js.Any])
    
    inline def setAcceptcharsetUndefined: Self = StObject.set(x, "acceptcharset", js.undefined)
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    inline def setEnctype(value: String): Self = StObject.set(x, "enctype", value.asInstanceOf[js.Any])
    
    inline def setEnctypeUndefined: Self = StObject.set(x, "enctype", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNovalidate(value: Booleanish): Self = StObject.set(x, "novalidate", value.asInstanceOf[js.Any])
    
    inline def setNovalidateUndefined: Self = StObject.set(x, "novalidate", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
