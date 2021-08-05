package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopProps[TLength] extends StObject {
  
  val top: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ js.Any
    ]
  ] = js.undefined
}
object TopProps {
  
  inline def apply[TLength](): TopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopProps[TLength]]
  }
  
  extension [Self <: TopProps[?], TLength](x: Self & TopProps[TLength]) {
    
    inline def setTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setTopVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ js.Any)*
    ): Self = StObject.set(x, "top", js.Array(value :_*))
  }
}
