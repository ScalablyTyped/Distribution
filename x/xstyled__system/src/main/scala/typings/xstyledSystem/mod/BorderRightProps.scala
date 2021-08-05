package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRightProps[TLength] extends StObject {
  
  val borderRight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRight<TLength> */ js.Any
    ]
  ] = js.undefined
}
object BorderRightProps {
  
  inline def apply[TLength](): BorderRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRightProps[TLength]]
  }
  
  extension [Self <: BorderRightProps[?], TLength](x: Self & BorderRightProps[TLength]) {
    
    inline def setBorderRight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRight<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    inline def setBorderRightVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRight<TLength> */ js.Any)*
    ): Self = StObject.set(x, "borderRight", js.Array(value :_*))
  }
}
