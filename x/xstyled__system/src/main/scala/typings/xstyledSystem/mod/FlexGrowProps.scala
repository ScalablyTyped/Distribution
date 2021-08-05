package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexGrowProps extends StObject {
  
  val flexGrow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ js.Any
    ]
  ] = js.undefined
}
object FlexGrowProps {
  
  inline def apply(): FlexGrowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexGrowProps]
  }
  
  extension [Self <: FlexGrowProps](x: Self) {
    
    inline def setFlexGrow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ js.Any
        ]
    ): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    inline def setFlexGrowVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ js.Any)*
    ): Self = StObject.set(x, "flexGrow", js.Array(value :_*))
  }
}
