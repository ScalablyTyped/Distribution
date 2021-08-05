package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderBottomColorProps extends StObject {
  
  val borderBottomColor: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ js.Any
    ]
  ] = js.undefined
}
object BorderBottomColorProps {
  
  inline def apply(): BorderBottomColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderBottomColorProps]
  }
  
  extension [Self <: BorderBottomColorProps](x: Self) {
    
    inline def setBorderBottomColor(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ js.Any
        ]
    ): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
    
    inline def setBorderBottomColorVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ js.Any)*
    ): Self = StObject.set(x, "borderBottomColor", js.Array(value :_*))
  }
}
