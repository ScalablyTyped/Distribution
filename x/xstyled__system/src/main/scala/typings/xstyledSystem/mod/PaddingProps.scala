package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingProps[TLength] extends StObject {
  
  val p: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ js.Any
    ]
  ] = js.undefined
  
  val padding: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ js.Any
    ]
  ] = js.undefined
}
object PaddingProps {
  
  inline def apply[TLength](): PaddingProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingProps[TLength]]
  }
  
  extension [Self <: PaddingProps[?], TLength](x: Self & PaddingProps[TLength]) {
    
    inline def setP(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setPVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ js.Any)*
    ): Self = StObject.set(x, "p", js.Array(value :_*))
    
    inline def setPadding(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ js.Any)*
    ): Self = StObject.set(x, "padding", js.Array(value :_*))
  }
}
