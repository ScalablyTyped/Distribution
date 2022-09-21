package typings.xstyledSystem.mod

import typings.csstype.mod.Property.MarginTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginProps[TLength] extends StObject {
  
  val m: js.UndefOr[ResponsiveValue[MarginTop[TLength]]] = js.undefined
  
  val margin: js.UndefOr[ResponsiveValue[MarginTop[TLength]]] = js.undefined
}
object MarginProps {
  
  inline def apply[TLength](): MarginProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginProps[TLength]]
  }
  
  extension [Self <: MarginProps[?], TLength](x: Self & MarginProps[TLength]) {
    
    inline def setM(value: ResponsiveValue[MarginTop[TLength]]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
    
    inline def setMVarargs(value: MarginTop[TLength]*): Self = StObject.set(x, "m", js.Array(value*))
    
    inline def setMargin(value: ResponsiveValue[MarginTop[TLength]]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: MarginTop[TLength]*): Self = StObject.set(x, "margin", js.Array(value*))
  }
}
