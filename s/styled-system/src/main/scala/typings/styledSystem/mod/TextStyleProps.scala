package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var textStyle: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.undefined
}
object TextStyleProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): TextStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyleProps[ThemeType]]
  }
  
  @scala.inline
  implicit class TextStylePropsMutableBuilder[Self <: TextStyleProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & TextStyleProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setTextStyle(value: ResponsiveValue[String, ThemeType]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTextStyleVarargs(value: (String | Null)*): Self = StObject.set(x, "textStyle", js.Array(value :_*))
  }
}
