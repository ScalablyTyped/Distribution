package typings.styledSystem.mod

import typings.csstype.mod.Property.GridRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridRowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The grid-row CSS property is a shorthand property for grid-row-start and grid-row-end specifying a grid item’s
    * size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid
    * placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row)
    */
  var gridRow: js.UndefOr[ResponsiveValue[GridRow, ThemeType]] = js.undefined
}
object GridRowProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): GridRowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRowProps[ThemeType]]
  }
  
  extension [Self <: GridRowProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & GridRowProps[ThemeType]) {
    
    inline def setGridRow(value: ResponsiveValue[GridRow, ThemeType]): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
    
    inline def setGridRowNull: Self = StObject.set(x, "gridRow", null)
    
    inline def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
    
    inline def setGridRowVarargs(value: (GridRow | Null)*): Self = StObject.set(x, "gridRow", js.Array(value*))
  }
}
