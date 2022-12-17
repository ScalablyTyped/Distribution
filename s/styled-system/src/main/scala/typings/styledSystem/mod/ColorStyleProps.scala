package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var colors: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.undefined
}
object ColorStyleProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): ColorStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorStyleProps[ThemeType]]
  }
  
  extension [Self <: ColorStyleProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & ColorStyleProps[ThemeType]) {
    
    inline def setColors(value: ResponsiveValue[String, ThemeType]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsNull: Self = StObject.set(x, "colors", null)
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: (String | Null)*): Self = StObject.set(x, "colors", js.Array(value*))
  }
}
