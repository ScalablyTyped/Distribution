package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingBottomProps[TLength] extends StObject {
  
  val paddingBottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ js.Any
    ]
  ] = js.undefined
  
  val pb: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ js.Any
    ]
  ] = js.undefined
}
object PaddingBottomProps {
  
  inline def apply[TLength](): PaddingBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingBottomProps[TLength]]
  }
  
  extension [Self <: PaddingBottomProps[?], TLength](x: Self & PaddingBottomProps[TLength]) {
    
    inline def setPaddingBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    inline def setPaddingBottomVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ js.Any)*
    ): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
    
    inline def setPb(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
    
    inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
    
    inline def setPbVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ js.Any)*
    ): Self = StObject.set(x, "pb", js.Array(value :_*))
  }
}
