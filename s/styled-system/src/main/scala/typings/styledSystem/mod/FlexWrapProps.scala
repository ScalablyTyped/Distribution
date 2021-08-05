package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexWrapProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The flex-wrap CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines.
    * If wrapping is allowed, it sets the direction that lines are stacked.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap)
    */
  var flexWrap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object FlexWrapProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): FlexWrapProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexWrapProps[ThemeType]]
  }
  
  extension [Self <: FlexWrapProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & FlexWrapProps[ThemeType]) {
    
    inline def setFlexWrap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
    
    inline def setFlexWrapNull: Self = StObject.set(x, "flexWrap", null)
    
    inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
    
    inline def setFlexWrapVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ js.Any) | Null)*
    ): Self = StObject.set(x, "flexWrap", js.Array(value :_*))
  }
}
