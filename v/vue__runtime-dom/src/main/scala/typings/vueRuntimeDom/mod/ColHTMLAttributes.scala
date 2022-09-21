package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var span: js.UndefOr[Numberish] = js.undefined
  
  var width: js.UndefOr[Numberish] = js.undefined
}
object ColHTMLAttributes {
  
  inline def apply(): ColHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColHTMLAttributes]
  }
  
  extension [Self <: ColHTMLAttributes](x: Self) {
    
    inline def setSpan(value: Numberish): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setWidth(value: Numberish): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
