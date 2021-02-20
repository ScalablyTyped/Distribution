package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingTopProps[TLength] extends StObject {
  
  val paddingTop: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
    ]
  ] = js.native
  
  val pt: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
    ]
  ] = js.native
}
object PaddingTopProps {
  
  @scala.inline
  def apply[TLength](): PaddingTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingTopProps[TLength]]
  }
  
  @scala.inline
  implicit class PaddingTopPropsMutableBuilder[Self <: PaddingTopProps[_], TLength] (val x: Self with PaddingTopProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setPaddingTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
        ]
    ): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    @scala.inline
    def setPaddingTopVarargs(value: js.Any*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
    
    @scala.inline
    def setPt(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
        ]
    ): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
    
    @scala.inline
    def setPtVarargs(value: js.Any*): Self = StObject.set(x, "pt", js.Array(value :_*))
  }
}
