package typings.styledSystem.mod

import typings.csstype.mod.Property.GridColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The grid-column CSS property is a shorthand property for grid-column-start and grid-column-end specifying
    * a grid item's size and location within the grid column by contributing a line, a span, or nothing (automatic)
    * to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column)
    */
  var gridColumn: js.UndefOr[ResponsiveValue[GridColumn, ThemeType]] = js.undefined
}
object GridColumnProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): GridColumnProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridColumnProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & GridColumnProps[ThemeType]) extends AnyVal {
    
    inline def setGridColumn(value: ResponsiveValue[GridColumn, ThemeType]): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
    
    inline def setGridColumnNull: Self = StObject.set(x, "gridColumn", null)
    
    inline def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
    
    inline def setGridColumnVarargs(value: (GridColumn | Null)*): Self = StObject.set(x, "gridColumn", js.Array(value*))
  }
}
