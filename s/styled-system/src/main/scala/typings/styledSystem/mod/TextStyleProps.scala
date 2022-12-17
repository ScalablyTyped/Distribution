package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var textStyle: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.undefined
}
object TextStyleProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): TextStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyleProps[ThemeType]]
  }
  
  extension [Self <: TextStyleProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & TextStyleProps[ThemeType]) {
    
    inline def setTextStyle(value: ResponsiveValue[String, ThemeType]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTextStyleVarargs(value: (String | Null)*): Self = StObject.set(x, "textStyle", js.Array(value*))
  }
}
