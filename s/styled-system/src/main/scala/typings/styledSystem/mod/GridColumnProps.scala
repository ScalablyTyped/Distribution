package typings.styledSystem.mod

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
  var gridColumn: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object GridColumnProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): GridColumnProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnProps[ThemeType]]
  }
  
  extension [Self <: GridColumnProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & GridColumnProps[ThemeType]) {
    
    inline def setGridColumn(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
    
    inline def setGridColumnNull: Self = StObject.set(x, "gridColumn", null)
    
    inline def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
    
    inline def setGridColumnVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ js.Any) | Null)*
    ): Self = StObject.set(x, "gridColumn", js.Array(value :_*))
  }
}
