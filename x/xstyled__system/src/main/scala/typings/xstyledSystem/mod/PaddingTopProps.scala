package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingTopProps[TLength] extends StObject {
  
  val paddingTop: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ js.Any
    ]
  ] = js.undefined
  
  val pt: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ js.Any
    ]
  ] = js.undefined
}
object PaddingTopProps {
  
  inline def apply[TLength](): PaddingTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingTopProps[TLength]]
  }
  
  extension [Self <: PaddingTopProps[?], TLength](x: Self & PaddingTopProps[TLength]) {
    
    inline def setPaddingTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    inline def setPaddingTopVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ js.Any)*
    ): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
    
    inline def setPt(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
    
    inline def setPtVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ js.Any)*
    ): Self = StObject.set(x, "pt", js.Array(value :_*))
  }
}
