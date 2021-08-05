package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingLeftProps[TLength] extends StObject {
  
  val paddingLeft: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ js.Any
    ]
  ] = js.undefined
  
  val pl: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ js.Any
    ]
  ] = js.undefined
}
object PaddingLeftProps {
  
  inline def apply[TLength](): PaddingLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingLeftProps[TLength]]
  }
  
  extension [Self <: PaddingLeftProps[?], TLength](x: Self & PaddingLeftProps[TLength]) {
    
    inline def setPaddingLeft(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingLeftVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ js.Any)*
    ): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
    
    inline def setPl(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
    
    inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
    
    inline def setPlVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ js.Any)*
    ): Self = StObject.set(x, "pl", js.Array(value :_*))
  }
}
