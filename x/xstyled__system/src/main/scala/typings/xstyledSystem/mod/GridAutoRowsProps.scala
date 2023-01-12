package typings.xstyledSystem.mod

import typings.csstype.mod.Property.GridAutoRows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAutoRowsProps[TLength] extends StObject {
  
  val gridAutoRows: js.UndefOr[ResponsiveValue[GridAutoRows[TLength]]] = js.undefined
}
object GridAutoRowsProps {
  
  inline def apply[TLength](): GridAutoRowsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoRowsProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridAutoRowsProps[?], TLength] (val x: Self & GridAutoRowsProps[TLength]) extends AnyVal {
    
    inline def setGridAutoRows(value: ResponsiveValue[GridAutoRows[TLength]]): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
    
    inline def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
    
    inline def setGridAutoRowsVarargs(value: GridAutoRows[TLength]*): Self = StObject.set(x, "gridAutoRows", js.Array(value*))
  }
}
