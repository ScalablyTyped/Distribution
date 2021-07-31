package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The opacity CSS property sets the transparency of an element or the degree to which content
    * behind an element is visible.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
    */
  var opacity: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object OpacityProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): OpacityProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacityProps[ThemeType]]
  }
  
  @scala.inline
  implicit class OpacityPropsMutableBuilder[Self <: OpacityProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & OpacityProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setOpacity(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityNull: Self = StObject.set(x, "opacity", null)
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOpacityVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any) | Null)*
    ): Self = StObject.set(x, "opacity", js.Array(value :_*))
  }
}
