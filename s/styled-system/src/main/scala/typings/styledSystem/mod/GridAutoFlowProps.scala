package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAutoFlowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The grid-auto-flow CSS property controls how the auto-placement algorithm works, specifying exactly
    * how auto-placed items get flowed into the grid.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow)
    */
  var gridAutoFlow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object GridAutoFlowProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): GridAutoFlowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoFlowProps[ThemeType]]
  }
  
  extension [Self <: GridAutoFlowProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & GridAutoFlowProps[ThemeType]) {
    
    inline def setGridAutoFlow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
    
    inline def setGridAutoFlowNull: Self = StObject.set(x, "gridAutoFlow", null)
    
    inline def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
    
    inline def setGridAutoFlowVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ js.Any) | Null)*
    ): Self = StObject.set(x, "gridAutoFlow", js.Array(value :_*))
  }
}
