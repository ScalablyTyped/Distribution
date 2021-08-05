package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginTopProps[TLength] extends StObject {
  
  val marginTop: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any
    ]
  ] = js.undefined
  
  val mt: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any
    ]
  ] = js.undefined
}
object MarginTopProps {
  
  inline def apply[TLength](): MarginTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginTopProps[TLength]]
  }
  
  extension [Self <: MarginTopProps[?], TLength](x: Self & MarginTopProps[TLength]) {
    
    inline def setMarginTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setMarginTopVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any)*
    ): Self = StObject.set(x, "marginTop", js.Array(value :_*))
    
    inline def setMt(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
    
    inline def setMtVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any)*
    ): Self = StObject.set(x, "mt", js.Array(value :_*))
  }
}
