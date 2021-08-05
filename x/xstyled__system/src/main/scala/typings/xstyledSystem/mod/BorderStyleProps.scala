package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderStyleProps extends StObject {
  
  val borderStyle: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ js.Any) | Double
    ]
  ] = js.undefined
}
object BorderStyleProps {
  
  inline def apply(): BorderStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderStyleProps]
  }
  
  extension [Self <: BorderStyleProps](x: Self) {
    
    inline def setBorderStyle(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ js.Any) | Double
        ]
    ): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setBorderStyleVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ js.Any) | Double)*
    ): Self = StObject.set(x, "borderStyle", js.Array(value :_*))
  }
}
