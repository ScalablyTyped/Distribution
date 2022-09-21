package typings.xstyledSystem.mod

import typings.csstype.mod.Property.BorderBottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderBottomProps[TLength] extends StObject {
  
  val borderBottom: js.UndefOr[ResponsiveValue[BorderBottom[TLength]]] = js.undefined
}
object BorderBottomProps {
  
  inline def apply[TLength](): BorderBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderBottomProps[TLength]]
  }
  
  extension [Self <: BorderBottomProps[?], TLength](x: Self & BorderBottomProps[TLength]) {
    
    inline def setBorderBottom(value: ResponsiveValue[BorderBottom[TLength]]): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    inline def setBorderBottomVarargs(value: BorderBottom[TLength]*): Self = StObject.set(x, "borderBottom", js.Array(value*))
  }
}
