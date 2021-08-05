package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexDirectionProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The flex-direction CSS property specifies how flex items are placed in the flex container defining the main
    * axis and the direction (normal or reversed).
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction)
    */
  var flexDirection: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object FlexDirectionProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): FlexDirectionProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexDirectionProps[ThemeType]]
  }
  
  extension [Self <: FlexDirectionProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & FlexDirectionProps[ThemeType]) {
    
    inline def setFlexDirection(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setFlexDirectionNull: Self = StObject.set(x, "flexDirection", null)
    
    inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
    
    inline def setFlexDirectionVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ js.Any) | Null)*
    ): Self = StObject.set(x, "flexDirection", js.Array(value :_*))
  }
}
