package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingProps[TLength] extends StObject {
  
  val p: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ _
    ]
  ] = js.native
  
  val padding: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ _
    ]
  ] = js.native
}
object PaddingProps {
  
  @scala.inline
  def apply[TLength](): PaddingProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingProps[TLength]]
  }
  
  @scala.inline
  implicit class PaddingPropsMutableBuilder[Self <: PaddingProps[_], TLength] (val x: Self with PaddingProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setP(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ _
        ]
    ): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    @scala.inline
    def setPVarargs(value: js.Any*): Self = StObject.set(x, "p", js.Array(value :_*))
    
    @scala.inline
    def setPadding(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ _
        ]
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: js.Any*): Self = StObject.set(x, "padding", js.Array(value :_*))
  }
}
