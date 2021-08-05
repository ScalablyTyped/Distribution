package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexWrapProps extends StObject {
  
  val flexWrap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ js.Any
    ]
  ] = js.undefined
}
object FlexWrapProps {
  
  inline def apply(): FlexWrapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexWrapProps]
  }
  
  extension [Self <: FlexWrapProps](x: Self) {
    
    inline def setFlexWrap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ js.Any
        ]
    ): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
    
    inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
    
    inline def setFlexWrapVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ js.Any)*
    ): Self = StObject.set(x, "flexWrap", js.Array(value :_*))
  }
}
