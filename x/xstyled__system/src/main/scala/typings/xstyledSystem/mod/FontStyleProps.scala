package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontStyleProps extends StObject {
  
  val fontStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontStyle */ _
    ]
  ] = js.native
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontStyle */ _
        ]
    ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontStyleVarargs(value: js.Any*): Self = StObject.set(x, "fontStyle", js.Array(value :_*))
  }
}
