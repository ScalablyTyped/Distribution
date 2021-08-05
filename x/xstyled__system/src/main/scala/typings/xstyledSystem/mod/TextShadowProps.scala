package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextShadowProps extends StObject {
  
  val textShadow: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextShadow */ js.Any) | Double
    ]
  ] = js.undefined
}
object TextShadowProps {
  
  inline def apply(): TextShadowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextShadowProps]
  }
  
  extension [Self <: TextShadowProps](x: Self) {
    
    inline def setTextShadow(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextShadow */ js.Any) | Double
        ]
    ): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
    
    inline def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
    
    inline def setTextShadowVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextShadow */ js.Any) | Double)*
    ): Self = StObject.set(x, "textShadow", js.Array(value :_*))
  }
}
