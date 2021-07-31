package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontStyleProps extends StObject {
  
  val fontStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontStyle */ js.Any
    ]
  ] = js.undefined
}
object FontStyleProps {
  
  @scala.inline
  def apply(): FontStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontStyleProps]
  }
  
  @scala.inline
  implicit class FontStylePropsMutableBuilder[Self <: FontStyleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontStyle */ js.Any
        ]
    ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontStyleVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontStyle */ js.Any)*
    ): Self = StObject.set(x, "fontStyle", js.Array(value :_*))
  }
}
