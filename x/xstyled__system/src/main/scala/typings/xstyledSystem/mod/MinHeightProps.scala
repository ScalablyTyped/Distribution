package typings.xstyledSystem.mod

import typings.csstype.mod.Property.MinHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinHeightProps[TLength] extends StObject {
  
  val minHeight: js.UndefOr[ResponsiveValue[MinHeight[TLength]]] = js.undefined
}
object MinHeightProps {
  
  inline def apply[TLength](): MinHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinHeightProps[TLength]]
  }
  
  extension [Self <: MinHeightProps[?], TLength](x: Self & MinHeightProps[TLength]) {
    
    inline def setMinHeight(value: ResponsiveValue[MinHeight[TLength]]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinHeightVarargs(value: MinHeight[TLength]*): Self = StObject.set(x, "minHeight", js.Array(value*))
  }
}
