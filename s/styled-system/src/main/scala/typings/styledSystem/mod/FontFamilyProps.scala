package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamilyProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var fontFamily: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object FontFamilyProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): FontFamilyProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFamilyProps[ThemeType]]
  }
  
  extension [Self <: FontFamilyProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & FontFamilyProps[ThemeType]) {
    
    inline def setFontFamily(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontFamilyVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any) | Null)*
    ): Self = StObject.set(x, "fontFamily", js.Array(value :_*))
  }
}
