package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginLeftProps[TLength] extends StObject {
  
  val marginLeft: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
    ]
  ] = js.native
  
  val ml: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
    ]
  ] = js.native
}
object MarginLeftProps {
  
  @scala.inline
  def apply[TLength](): MarginLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginLeftProps[TLength]]
  }
  
  @scala.inline
  implicit class MarginLeftPropsMutableBuilder[Self <: MarginLeftProps[_], TLength] (val x: Self with MarginLeftProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setMarginLeft(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
        ]
    ): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginLeftVarargs(value: js.Any*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
    
    @scala.inline
    def setMl(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
        ]
    ): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
    
    @scala.inline
    def setMlVarargs(value: js.Any*): Self = StObject.set(x, "ml", js.Array(value :_*))
  }
}
