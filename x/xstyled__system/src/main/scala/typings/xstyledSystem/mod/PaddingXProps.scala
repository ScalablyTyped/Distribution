package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingXProps[TLength] extends StObject {
  
  val px: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
    ]
  ] = js.native
}
object PaddingXProps {
  
  @scala.inline
  def apply[TLength](): PaddingXProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingXProps[TLength]]
  }
  
  @scala.inline
  implicit class PaddingXPropsMutableBuilder[Self <: PaddingXProps[_], TLength] (val x: Self with PaddingXProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setPx(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
        ]
    ): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
    
    @scala.inline
    def setPxVarargs(value: js.Any*): Self = StObject.set(x, "px", js.Array(value :_*))
  }
}
