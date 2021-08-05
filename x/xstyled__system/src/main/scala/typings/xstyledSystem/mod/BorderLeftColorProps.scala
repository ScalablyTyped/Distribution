package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderLeftColorProps extends StObject {
  
  val borderLeftColor: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ js.Any
    ]
  ] = js.undefined
}
object BorderLeftColorProps {
  
  inline def apply(): BorderLeftColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderLeftColorProps]
  }
  
  extension [Self <: BorderLeftColorProps](x: Self) {
    
    inline def setBorderLeftColor(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ js.Any
        ]
    ): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
    
    inline def setBorderLeftColorVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ js.Any)*
    ): Self = StObject.set(x, "borderLeftColor", js.Array(value :_*))
  }
}
