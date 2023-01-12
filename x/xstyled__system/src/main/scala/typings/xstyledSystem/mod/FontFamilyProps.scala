package typings.xstyledSystem.mod

import typings.csstype.mod.Property.FontFamily
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamilyProps extends StObject {
  
  val fontFamily: js.UndefOr[ResponsiveValue[FontFamily | Double]] = js.undefined
}
object FontFamilyProps {
  
  inline def apply(): FontFamilyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFamilyProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFamilyProps] (val x: Self) extends AnyVal {
    
    inline def setFontFamily(value: ResponsiveValue[FontFamily | Double]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontFamilyVarargs(value: (FontFamily | Double)*): Self = StObject.set(x, "fontFamily", js.Array(value*))
  }
}
