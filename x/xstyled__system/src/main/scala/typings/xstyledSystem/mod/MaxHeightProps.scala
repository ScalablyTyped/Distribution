package typings.xstyledSystem.mod

import typings.csstype.mod.Property.MaxHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxHeightProps[TLength] extends StObject {
  
  val maxHeight: js.UndefOr[ResponsiveValue[MaxHeight[TLength]]] = js.undefined
}
object MaxHeightProps {
  
  inline def apply[TLength](): MaxHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxHeightProps[TLength]]
  }
  
  extension [Self <: MaxHeightProps[?], TLength](x: Self & MaxHeightProps[TLength]) {
    
    inline def setMaxHeight(value: ResponsiveValue[MaxHeight[TLength]]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxHeightVarargs(value: MaxHeight[TLength]*): Self = StObject.set(x, "maxHeight", js.Array(value*))
  }
}
