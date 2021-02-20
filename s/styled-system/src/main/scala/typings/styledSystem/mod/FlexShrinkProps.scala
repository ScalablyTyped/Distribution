package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexShrinkProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The flex-shrink CSS property sets the flex shrink factor of a flex item. If the size of all flex items is larger
    * than the flex container, items shrink to fit according to flex-shrink.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-shrink)
    */
  var flexShrink: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexShrink */ _, 
      ThemeType
    ]
  ] = js.native
}
object FlexShrinkProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): FlexShrinkProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexShrinkProps[ThemeType]]
  }
  
  @scala.inline
  implicit class FlexShrinkPropsMutableBuilder[Self <: FlexShrinkProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with FlexShrinkProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setFlexShrink(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexShrink */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexShrinkNull: Self = StObject.set(x, "flexShrink", null)
    
    @scala.inline
    def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    @scala.inline
    def setFlexShrinkVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "flexShrink", js.Array(value :_*))
  }
}
