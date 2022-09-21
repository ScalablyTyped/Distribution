package typings.xstyledSystem.mod

import typings.csstype.mod.Property.MinWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinWidthProps[TLength] extends StObject {
  
  val minWidth: js.UndefOr[ResponsiveValue[MinWidth[TLength]]] = js.undefined
}
object MinWidthProps {
  
  inline def apply[TLength](): MinWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinWidthProps[TLength]]
  }
  
  extension [Self <: MinWidthProps[?], TLength](x: Self & MinWidthProps[TLength]) {
    
    inline def setMinWidth(value: ResponsiveValue[MinWidth[TLength]]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMinWidthVarargs(value: MinWidth[TLength]*): Self = StObject.set(x, "minWidth", js.Array(value*))
  }
}
