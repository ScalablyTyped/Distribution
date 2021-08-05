package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayProps extends StObject {
  
  val display: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any
    ]
  ] = js.undefined
}
object DisplayProps {
  
  inline def apply(): DisplayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayProps]
  }
  
  extension [Self <: DisplayProps](x: Self) {
    
    inline def setDisplay(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any
        ]
    ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setDisplayVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any)*
    ): Self = StObject.set(x, "display", js.Array(value :_*))
  }
}
