package typings.styledSystem.mod

import typings.csstype.mod.Property.FontFamily
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamilyProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var fontFamily: js.UndefOr[ResponsiveValue[FontFamily, ThemeType]] = js.undefined
}
object FontFamilyProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): FontFamilyProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFamilyProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFamilyProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & FontFamilyProps[ThemeType]) extends AnyVal {
    
    inline def setFontFamily(value: ResponsiveValue[FontFamily, ThemeType]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontFamilyVarargs(value: (FontFamily | Null)*): Self = StObject.set(x, "fontFamily", js.Array(value*))
  }
}
