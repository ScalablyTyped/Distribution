package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginBottomProps[TLength] extends StObject {
  
  val marginBottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ js.Any
    ]
  ] = js.undefined
  
  val mb: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ js.Any
    ]
  ] = js.undefined
}
object MarginBottomProps {
  
  inline def apply[TLength](): MarginBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginBottomProps[TLength]]
  }
  
  extension [Self <: MarginBottomProps[?], TLength](x: Self & MarginBottomProps[TLength]) {
    
    inline def setMarginBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginBottomVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ js.Any)*
    ): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
    
    inline def setMb(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
    
    inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
    
    inline def setMbVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ js.Any)*
    ): Self = StObject.set(x, "mb", js.Array(value :_*))
  }
}
