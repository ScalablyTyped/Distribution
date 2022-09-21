package typings.xstyledSystem.mod

import typings.csstype.mod.Property.MarginLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginLeftProps[TLength] extends StObject {
  
  val marginLeft: js.UndefOr[ResponsiveValue[MarginLeft[TLength]]] = js.undefined
  
  val ml: js.UndefOr[ResponsiveValue[MarginLeft[TLength]]] = js.undefined
}
object MarginLeftProps {
  
  inline def apply[TLength](): MarginLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginLeftProps[TLength]]
  }
  
  extension [Self <: MarginLeftProps[?], TLength](x: Self & MarginLeftProps[TLength]) {
    
    inline def setMarginLeft(value: ResponsiveValue[MarginLeft[TLength]]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginLeftVarargs(value: MarginLeft[TLength]*): Self = StObject.set(x, "marginLeft", js.Array(value*))
    
    inline def setMl(value: ResponsiveValue[MarginLeft[TLength]]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
    
    inline def setMlVarargs(value: MarginLeft[TLength]*): Self = StObject.set(x, "ml", js.Array(value*))
  }
}
