package typings.xstyledSystem.mod

import typings.csstype.mod.Property.GridColumnGap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnGapProps[TLength] extends StObject {
  
  val gridColumnGap: js.UndefOr[ResponsiveValue[GridColumnGap[TLength]]] = js.undefined
}
object GridColumnGapProps {
  
  inline def apply[TLength](): GridColumnGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnGapProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridColumnGapProps[?], TLength] (val x: Self & GridColumnGapProps[TLength]) extends AnyVal {
    
    inline def setGridColumnGap(value: ResponsiveValue[GridColumnGap[TLength]]): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
    
    inline def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
    
    inline def setGridColumnGapVarargs(value: GridColumnGap[TLength]*): Self = StObject.set(x, "gridColumnGap", js.Array(value*))
  }
}
