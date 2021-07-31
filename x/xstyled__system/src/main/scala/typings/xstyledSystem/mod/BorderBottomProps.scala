package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderBottomProps[TLength] extends StObject {
  
  val borderBottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottom<TLength> */ js.Any
    ]
  ] = js.undefined
}
object BorderBottomProps {
  
  @scala.inline
  def apply[TLength](): BorderBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderBottomProps[TLength]]
  }
  
  @scala.inline
  implicit class BorderBottomPropsMutableBuilder[Self <: BorderBottomProps[?], TLength] (val x: Self & BorderBottomProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setBorderBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottom<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    @scala.inline
    def setBorderBottomVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottom<TLength> */ js.Any)*
    ): Self = StObject.set(x, "borderBottom", js.Array(value :_*))
  }
}
