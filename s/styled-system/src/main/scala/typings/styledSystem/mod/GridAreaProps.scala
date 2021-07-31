package typings.styledSystem.mod

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
  var gridArea: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridArea */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object GridAreaProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): GridAreaProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAreaProps[ThemeType]]
  }
  
  @scala.inline
  implicit class GridAreaPropsMutableBuilder[Self <: GridAreaProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & GridAreaProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setGridArea(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridArea */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAreaNull: Self = StObject.set(x, "gridArea", null)
    
    @scala.inline
    def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
    
    @scala.inline
    def setGridAreaVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridArea */ js.Any) | Null)*
    ): Self = StObject.set(x, "gridArea", js.Array(value :_*))
  }
}
