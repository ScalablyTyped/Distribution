package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridGapProps[TLength] extends StObject {
  
  val gridGap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLength> */ js.Any
    ]
  ] = js.undefined
}
object GridGapProps {
  
  inline def apply[TLength](): GridGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridGapProps[TLength]]
  }
  
  extension [Self <: GridGapProps[?], TLength](x: Self & GridGapProps[TLength]) {
    
    inline def setGridGap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
    
    inline def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
    
    inline def setGridGapVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLength> */ js.Any)*
    ): Self = StObject.set(x, "gridGap", js.Array(value :_*))
  }
}
