package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextShadowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The `text-shadow` CSS property adds shadows to text. It accepts a comma-separated list of shadows to be applied
    * to the text and any of its `decorations`. Each shadow is described by some combination of X and Y offsets from
    * the element, blur radius, and color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/text-shadow)
    */
  var textShadow: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextShadow */ js.Any) | Double, 
      ThemeType
    ]
  ] = js.undefined
}
object TextShadowProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): TextShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextShadowProps[ThemeType]]
  }
  
  @scala.inline
  implicit class TextShadowPropsMutableBuilder[Self <: TextShadowProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & TextShadowProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setTextShadow(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextShadow */ js.Any) | Double, 
          ThemeType
        ]
    ): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowNull: Self = StObject.set(x, "textShadow", null)
    
    @scala.inline
    def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
    
    @scala.inline
    def setTextShadowVarargs(
      value: (((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextShadow */ js.Any) | Double) | Null)*
    ): Self = StObject.set(x, "textShadow", js.Array(value :_*))
  }
}
