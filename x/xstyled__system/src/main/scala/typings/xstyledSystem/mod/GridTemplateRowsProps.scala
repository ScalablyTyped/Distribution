package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridTemplateRowsProps[TLength] extends StObject {
  
  val gridTemplateRows: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateRows<TLength> */ js.Any
    ]
  ] = js.undefined
}
object GridTemplateRowsProps {
  
  inline def apply[TLength](): GridTemplateRowsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateRowsProps[TLength]]
  }
  
  extension [Self <: GridTemplateRowsProps[?], TLength](x: Self & GridTemplateRowsProps[TLength]) {
    
    inline def setGridTemplateRows(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateRows<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
    
    inline def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
    
    inline def setGridTemplateRowsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateRows<TLength> */ js.Any)*
    ): Self = StObject.set(x, "gridTemplateRows", js.Array(value :_*))
  }
}
