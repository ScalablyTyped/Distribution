package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontSizeProps[TLength] extends StObject {
  
  val fontSize: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<TLength> */ _
    ]
  ] = js.native
}
object FontSizeProps {
  
  @scala.inline
  def apply[TLength](): FontSizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSizeProps[TLength]]
  }
  
  @scala.inline
  implicit class FontSizePropsMutableBuilder[Self <: FontSizeProps[_], TLength] (val x: Self with FontSizeProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setFontSize(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<TLength> */ _
        ]
    ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontSizeVarargs(value: js.Any*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
  }
}
