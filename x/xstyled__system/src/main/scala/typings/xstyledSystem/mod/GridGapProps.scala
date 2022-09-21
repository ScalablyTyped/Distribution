package typings.xstyledSystem.mod

import typings.csstype.mod.Property.GridGap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridGapProps[TLength] extends StObject {
  
  val gridGap: js.UndefOr[ResponsiveValue[GridGap[TLength]]] = js.undefined
}
object GridGapProps {
  
  inline def apply[TLength](): GridGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridGapProps[TLength]]
  }
  
  extension [Self <: GridGapProps[?], TLength](x: Self & GridGapProps[TLength]) {
    
    inline def setGridGap(value: ResponsiveValue[GridGap[TLength]]): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
    
    inline def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
    
    inline def setGridGapVarargs(value: GridGap[TLength]*): Self = StObject.set(x, "gridGap", js.Array(value*))
  }
}
