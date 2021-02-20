package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFamilyProps extends StObject {
  
  val fontFamily: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ _) | Double
    ]
  ] = js.native
}
object FontFamilyProps {
  
  @scala.inline
  def apply(): FontFamilyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFamilyProps]
  }
  
  @scala.inline
  implicit class FontFamilyPropsMutableBuilder[Self <: FontFamilyProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontFamily(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ _) | Double
        ]
    ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontFamilyVarargs(value: (js.Any | Double)*): Self = StObject.set(x, "fontFamily", js.Array(value :_*))
  }
}
