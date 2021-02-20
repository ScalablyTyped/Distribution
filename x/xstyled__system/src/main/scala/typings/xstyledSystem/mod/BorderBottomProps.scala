package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderBottomProps[TLength] extends StObject {
  
  val borderBottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottom<TLength> */ _
    ]
  ] = js.native
}
object BorderBottomProps {
  
  @scala.inline
  def apply[TLength](): BorderBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderBottomProps[TLength]]
  }
  
  @scala.inline
  implicit class BorderBottomPropsMutableBuilder[Self <: BorderBottomProps[_], TLength] (val x: Self with BorderBottomProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setBorderBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottom<TLength> */ _
        ]
    ): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    @scala.inline
    def setBorderBottomVarargs(value: js.Any*): Self = StObject.set(x, "borderBottom", js.Array(value :_*))
  }
}
