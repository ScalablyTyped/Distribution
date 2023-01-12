package typings.styledSystem.mod

import typings.csstype.mod.Property.TextAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAlignProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The text-align CSS property specifies the horizontal alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/text-align)
    */
  var textAlign: js.UndefOr[ResponsiveValue[TextAlign, ThemeType]] = js.undefined
}
object TextAlignProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): TextAlignProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAlignProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextAlignProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & TextAlignProps[ThemeType]) extends AnyVal {
    
    inline def setTextAlign(value: ResponsiveValue[TextAlign, ThemeType]): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignNull: Self = StObject.set(x, "textAlign", null)
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextAlignVarargs(value: (TextAlign | Null)*): Self = StObject.set(x, "textAlign", js.Array(value*))
  }
}
