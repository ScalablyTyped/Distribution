package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingLeftProps[TLength] extends StObject {
  
  val paddingLeft: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
    ]
  ] = js.native
  
  val pl: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
    ]
  ] = js.native
}
object PaddingLeftProps {
  
  @scala.inline
  def apply[TLength](): PaddingLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingLeftProps[TLength]]
  }
  
  @scala.inline
  implicit class PaddingLeftPropsMutableBuilder[Self <: PaddingLeftProps[_], TLength] (val x: Self with PaddingLeftProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setPaddingLeft(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
        ]
    ): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingLeftVarargs(value: js.Any*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
    
    @scala.inline
    def setPl(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
        ]
    ): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
    
    @scala.inline
    def setPlVarargs(value: js.Any*): Self = StObject.set(x, "pl", js.Array(value :_*))
  }
}
