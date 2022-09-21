package typings.xstyledSystem.mod

import typings.csstype.mod.Property.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomProps[TLength] extends StObject {
  
  val bottom: js.UndefOr[ResponsiveValue[Bottom[TLength]]] = js.undefined
}
object BottomProps {
  
  inline def apply[TLength](): BottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomProps[TLength]]
  }
  
  extension [Self <: BottomProps[?], TLength](x: Self & BottomProps[TLength]) {
    
    inline def setBottom(value: ResponsiveValue[Bottom[TLength]]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setBottomVarargs(value: Bottom[TLength]*): Self = StObject.set(x, "bottom", js.Array(value*))
  }
}
