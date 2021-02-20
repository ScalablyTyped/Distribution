package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginRightProps[TLength] extends StObject {
  
  val marginRight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ _
    ]
  ] = js.native
  
  val mr: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ _
    ]
  ] = js.native
}
object MarginRightProps {
  
  @scala.inline
  def apply[TLength](): MarginRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginRightProps[TLength]]
  }
  
  @scala.inline
  implicit class MarginRightPropsMutableBuilder[Self <: MarginRightProps[_], TLength] (val x: Self with MarginRightProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setMarginRight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ _
        ]
    ): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    @scala.inline
    def setMarginRightVarargs(value: js.Any*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
    
    @scala.inline
    def setMr(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ _
        ]
    ): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
    
    @scala.inline
    def setMrVarargs(value: js.Any*): Self = StObject.set(x, "mr", js.Array(value :_*))
  }
}
