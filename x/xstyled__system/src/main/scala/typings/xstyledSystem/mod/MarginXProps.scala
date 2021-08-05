package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginXProps[TLength] extends StObject {
  
  val mx: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ js.Any
    ]
  ] = js.undefined
}
object MarginXProps {
  
  inline def apply[TLength](): MarginXProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginXProps[TLength]]
  }
  
  extension [Self <: MarginXProps[?], TLength](x: Self & MarginXProps[TLength]) {
    
    inline def setMx(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
    
    inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
    
    inline def setMxVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ js.Any)*
    ): Self = StObject.set(x, "mx", js.Array(value :_*))
  }
}
