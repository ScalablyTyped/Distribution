package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingBottomProps[TLength] extends StObject {
  
  val paddingBottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
    ]
  ] = js.native
  
  val pb: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
    ]
  ] = js.native
}
object PaddingBottomProps {
  
  @scala.inline
  def apply[TLength](): PaddingBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingBottomProps[TLength]]
  }
  
  @scala.inline
  implicit class PaddingBottomPropsMutableBuilder[Self <: PaddingBottomProps[_], TLength] (val x: Self with PaddingBottomProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setPaddingBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
        ]
    ): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    @scala.inline
    def setPaddingBottomVarargs(value: js.Any*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
    
    @scala.inline
    def setPb(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
        ]
    ): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
    
    @scala.inline
    def setPbVarargs(value: js.Any*): Self = StObject.set(x, "pb", js.Array(value :_*))
  }
}
