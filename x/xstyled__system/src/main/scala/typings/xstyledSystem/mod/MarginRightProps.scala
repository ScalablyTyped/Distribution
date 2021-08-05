package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginRightProps[TLength] extends StObject {
  
  val marginRight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ js.Any
    ]
  ] = js.undefined
  
  val mr: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ js.Any
    ]
  ] = js.undefined
}
object MarginRightProps {
  
  inline def apply[TLength](): MarginRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginRightProps[TLength]]
  }
  
  extension [Self <: MarginRightProps[?], TLength](x: Self & MarginRightProps[TLength]) {
    
    inline def setMarginRight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginRightVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ js.Any)*
    ): Self = StObject.set(x, "marginRight", js.Array(value :_*))
    
    inline def setMr(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
    
    inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
    
    inline def setMrVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ js.Any)*
    ): Self = StObject.set(x, "mr", js.Array(value :_*))
  }
}
