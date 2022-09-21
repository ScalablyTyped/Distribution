package typings.xstyledSystem.mod

import typings.csstype.mod.Property.MarginTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginTopProps[TLength] extends StObject {
  
  val marginTop: js.UndefOr[ResponsiveValue[MarginTop[TLength]]] = js.undefined
  
  val mt: js.UndefOr[ResponsiveValue[MarginTop[TLength]]] = js.undefined
}
object MarginTopProps {
  
  inline def apply[TLength](): MarginTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginTopProps[TLength]]
  }
  
  extension [Self <: MarginTopProps[?], TLength](x: Self & MarginTopProps[TLength]) {
    
    inline def setMarginTop(value: ResponsiveValue[MarginTop[TLength]]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setMarginTopVarargs(value: MarginTop[TLength]*): Self = StObject.set(x, "marginTop", js.Array(value*))
    
    inline def setMt(value: ResponsiveValue[MarginTop[TLength]]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
    
    inline def setMtVarargs(value: MarginTop[TLength]*): Self = StObject.set(x, "mt", js.Array(value*))
  }
}
