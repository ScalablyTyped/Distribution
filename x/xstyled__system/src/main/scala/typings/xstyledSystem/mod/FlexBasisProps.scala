package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexBasisProps[TLength] extends StObject {
  
  val flexBasis: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexBasis<TLength> */ _
    ]
  ] = js.native
}
object FlexBasisProps {
  
  @scala.inline
  def apply[TLength](): FlexBasisProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexBasisProps[TLength]]
  }
  
  @scala.inline
  implicit class FlexBasisPropsMutableBuilder[Self <: FlexBasisProps[_], TLength] (val x: Self with FlexBasisProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setFlexBasis(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexBasis<TLength> */ _
        ]
    ): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
    
    @scala.inline
    def setFlexBasisVarargs(value: js.Any*): Self = StObject.set(x, "flexBasis", js.Array(value :_*))
  }
}
