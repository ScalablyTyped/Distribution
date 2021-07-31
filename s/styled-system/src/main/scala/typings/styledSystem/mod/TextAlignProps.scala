package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAlignProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The text-align CSS property specifies the horizontal alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/text-align)
    */
  var textAlign: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object TextAlignProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): TextAlignProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAlignProps[ThemeType]]
  }
  
  @scala.inline
  implicit class TextAlignPropsMutableBuilder[Self <: TextAlignProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & TextAlignProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setTextAlign(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignNull: Self = StObject.set(x, "textAlign", null)
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextAlignVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ js.Any) | Null)*
    ): Self = StObject.set(x, "textAlign", js.Array(value :_*))
  }
}
