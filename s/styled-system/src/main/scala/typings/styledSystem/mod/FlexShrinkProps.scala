package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexShrinkProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The flex-shrink CSS property sets the flex shrink factor of a flex item. If the size of all flex items is larger
    * than the flex container, items shrink to fit according to flex-shrink.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-shrink)
    */
  var flexShrink: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexShrink */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object FlexShrinkProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): FlexShrinkProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexShrinkProps[ThemeType]]
  }
  
  extension [Self <: FlexShrinkProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & FlexShrinkProps[ThemeType]) {
    
    inline def setFlexShrink(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexShrink */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    inline def setFlexShrinkNull: Self = StObject.set(x, "flexShrink", null)
    
    inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    inline def setFlexShrinkVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexShrink */ js.Any) | Null)*
    ): Self = StObject.set(x, "flexShrink", js.Array(value :_*))
  }
}
