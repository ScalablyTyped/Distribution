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
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): FlexWrapProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexWrapProps[ThemeType]]
  }
  
  @scala.inline
  implicit class FlexWrapPropsMutableBuilder[Self <: FlexWrapProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & FlexWrapProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setFlexWrap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexWrapNull: Self = StObject.set(x, "flexWrap", null)
    
    @scala.inline
    def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
    
    @scala.inline
    def setFlexWrapVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ js.Any) | Null)*
    ): Self = StObject.set(x, "flexWrap", js.Array(value :_*))
  }
}
