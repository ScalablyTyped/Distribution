package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAutoRowsProps[TLength] extends StObject {
  
  val gridAutoRows: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLength> */ js.Any
    ]
  ] = js.undefined
}
object GridAutoRowsProps {
  
  inline def apply[TLength](): GridAutoRowsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoRowsProps[TLength]]
  }
  
  extension [Self <: GridAutoRowsProps[?], TLength](x: Self & GridAutoRowsProps[TLength]) {
    
    inline def setGridAutoRows(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
    
    inline def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
    
    inline def setGridAutoRowsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLength> */ js.Any)*
    ): Self = StObject.set(x, "gridAutoRows", js.Array(value :_*))
  }
}
