package typings.xstyledSystem.mod

import typings.csstype.mod.Property.MarginBottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginBottomProps[TLength] extends StObject {
  
  val marginBottom: js.UndefOr[ResponsiveValue[MarginBottom[TLength]]] = js.undefined
  
  val mb: js.UndefOr[ResponsiveValue[MarginBottom[TLength]]] = js.undefined
}
object MarginBottomProps {
  
  inline def apply[TLength](): MarginBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginBottomProps[TLength]]
  }
  
  extension [Self <: MarginBottomProps[?], TLength](x: Self & MarginBottomProps[TLength]) {
    
    inline def setMarginBottom(value: ResponsiveValue[MarginBottom[TLength]]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginBottomVarargs(value: MarginBottom[TLength]*): Self = StObject.set(x, "marginBottom", js.Array(value*))
    
    inline def setMb(value: ResponsiveValue[MarginBottom[TLength]]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
    
    inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
    
    inline def setMbVarargs(value: MarginBottom[TLength]*): Self = StObject.set(x, "mb", js.Array(value*))
  }
}
