package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var `for`: js.UndefOr[String] = js.undefined
  
  var form: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object OutputHTMLAttributes {
  
  inline def apply(): OutputHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputHTMLAttributes]
  }
  
  extension [Self <: OutputHTMLAttributes](x: Self) {
    
    inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
