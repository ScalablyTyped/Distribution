package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexDirectionProps extends StObject {
  
  val flexDirection: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ js.Any
    ]
  ] = js.undefined
}
object FlexDirectionProps {
  
  inline def apply(): FlexDirectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexDirectionProps]
  }
  
  extension [Self <: FlexDirectionProps](x: Self) {
    
    inline def setFlexDirection(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ js.Any
        ]
    ): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
    
    inline def setFlexDirectionVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ js.Any)*
    ): Self = StObject.set(x, "flexDirection", js.Array(value :_*))
  }
}
