package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnProps extends StObject {
  
  val gridColumn: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ js.Any
    ]
  ] = js.undefined
}
object GridColumnProps {
  
  inline def apply(): GridColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnProps]
  }
  
  extension [Self <: GridColumnProps](x: Self) {
    
    inline def setGridColumn(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ js.Any
        ]
    ): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
    
    inline def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
    
    inline def setGridColumnVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ js.Any)*
    ): Self = StObject.set(x, "gridColumn", js.Array(value :_*))
  }
}
