package typings.xstyledSystem.mod

import typings.csstype.mod.Property.GridAutoColumns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAutoColumnsProps[TLength] extends StObject {
  
  val gridAutoColumns: js.UndefOr[ResponsiveValue[GridAutoColumns[TLength]]] = js.undefined
}
object GridAutoColumnsProps {
  
  inline def apply[TLength](): GridAutoColumnsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoColumnsProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridAutoColumnsProps[?], TLength] (val x: Self & GridAutoColumnsProps[TLength]) extends AnyVal {
    
    inline def setGridAutoColumns(value: ResponsiveValue[GridAutoColumns[TLength]]): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
    
    inline def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
    
    inline def setGridAutoColumnsVarargs(value: GridAutoColumns[TLength]*): Self = StObject.set(x, "gridAutoColumns", js.Array(value*))
  }
}
