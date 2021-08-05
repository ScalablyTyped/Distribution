package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnGapProps[TLength] extends StObject {
  
  val gridColumnGap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumnGap<TLength> */ js.Any
    ]
  ] = js.undefined
}
object GridColumnGapProps {
  
  inline def apply[TLength](): GridColumnGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnGapProps[TLength]]
  }
  
  extension [Self <: GridColumnGapProps[?], TLength](x: Self & GridColumnGapProps[TLength]) {
    
    inline def setGridColumnGap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumnGap<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
    
    inline def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
    
    inline def setGridColumnGapVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumnGap<TLength> */ js.Any)*
    ): Self = StObject.set(x, "gridColumnGap", js.Array(value :_*))
  }
}
