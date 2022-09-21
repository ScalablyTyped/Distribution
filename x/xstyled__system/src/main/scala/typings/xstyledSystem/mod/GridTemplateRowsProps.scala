package typings.xstyledSystem.mod

import typings.csstype.mod.Property.GridTemplateRows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridTemplateRowsProps[TLength] extends StObject {
  
  val gridTemplateRows: js.UndefOr[ResponsiveValue[GridTemplateRows[TLength]]] = js.undefined
}
object GridTemplateRowsProps {
  
  inline def apply[TLength](): GridTemplateRowsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateRowsProps[TLength]]
  }
  
  extension [Self <: GridTemplateRowsProps[?], TLength](x: Self & GridTemplateRowsProps[TLength]) {
    
    inline def setGridTemplateRows(value: ResponsiveValue[GridTemplateRows[TLength]]): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
    
    inline def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
    
    inline def setGridTemplateRowsVarargs(value: GridTemplateRows[TLength]*): Self = StObject.set(x, "gridTemplateRows", js.Array(value*))
  }
}
