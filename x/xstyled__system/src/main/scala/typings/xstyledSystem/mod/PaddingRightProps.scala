package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingRightProps[TLength] extends StObject {
  
  val paddingRight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingRight<TLength> */ _
    ]
  ] = js.native
  
  val pr: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingRight<TLength> */ _
    ]
  ] = js.native
}
object PaddingRightProps {
  
  @scala.inline
  def apply[TLength](): PaddingRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingRightProps[TLength]]
  }
  
  @scala.inline
  implicit class PaddingRightPropsMutableBuilder[Self <: PaddingRightProps[_], TLength] (val x: Self with PaddingRightProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setPaddingRight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingRight<TLength> */ _
        ]
    ): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingRightVarargs(value: js.Any*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
    
    @scala.inline
    def setPr(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingRight<TLength> */ _
        ]
    ): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    @scala.inline
    def setPrVarargs(value: js.Any*): Self = StObject.set(x, "pr", js.Array(value :_*))
  }
}
