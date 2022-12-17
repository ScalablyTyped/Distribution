package typings.styledSystem.mod

import typings.csstype.mod.Property.GridArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAreaProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The grid-area CSS property is a shorthand property for grid-row-start, grid-column-start, grid-row-end
    * and grid-column-end, specifying a grid item’s size and location within the grid row by contributing a line,
    * a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-area)
    */
  var gridArea: js.UndefOr[ResponsiveValue[GridArea, ThemeType]] = js.undefined
}
object GridAreaProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): GridAreaProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAreaProps[ThemeType]]
  }
  
  extension [Self <: GridAreaProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & GridAreaProps[ThemeType]) {
    
    inline def setGridArea(value: ResponsiveValue[GridArea, ThemeType]): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
    
    inline def setGridAreaNull: Self = StObject.set(x, "gridArea", null)
    
    inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
    
    inline def setGridAreaVarargs(value: (GridArea | Null)*): Self = StObject.set(x, "gridArea", js.Array(value*))
  }
}
