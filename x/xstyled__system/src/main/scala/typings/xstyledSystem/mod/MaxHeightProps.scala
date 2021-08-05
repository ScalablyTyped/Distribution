package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxHeightProps[TLength] extends StObject {
  
  val maxHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLength> */ js.Any
    ]
  ] = js.undefined
}
object MaxHeightProps {
  
  inline def apply[TLength](): MaxHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxHeightProps[TLength]]
  }
  
  extension [Self <: MaxHeightProps[?], TLength](x: Self & MaxHeightProps[TLength]) {
    
    inline def setMaxHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxHeightVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLength> */ js.Any)*
    ): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
  }
}
