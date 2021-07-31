package typings.styledSystem.mod

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
  var gridRow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRow */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object GridRowProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): GridRowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRowProps[ThemeType]]
  }
  
  @scala.inline
  implicit class GridRowPropsMutableBuilder[Self <: GridRowProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & GridRowProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setGridRow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRow */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridRowNull: Self = StObject.set(x, "gridRow", null)
    
    @scala.inline
    def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
    
    @scala.inline
    def setGridRowVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRow */ js.Any) | Null)*
    ): Self = StObject.set(x, "gridRow", js.Array(value :_*))
  }
}
