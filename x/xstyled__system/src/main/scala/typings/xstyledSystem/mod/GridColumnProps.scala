package typings.xstyledSystem.mod

import typings.csstype.mod.Property.GridColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnProps extends StObject {
  
  val gridColumn: js.UndefOr[ResponsiveValue[GridColumn]] = js.undefined
}
object GridColumnProps {
  
  inline def apply(): GridColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnProps]
  }
  
  extension [Self <: GridColumnProps](x: Self) {
    
    inline def setGridColumn(value: ResponsiveValue[GridColumn]): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
    
    inline def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
    
    inline def setGridColumnVarargs(value: GridColumn*): Self = StObject.set(x, "gridColumn", js.Array(value*))
  }
}
