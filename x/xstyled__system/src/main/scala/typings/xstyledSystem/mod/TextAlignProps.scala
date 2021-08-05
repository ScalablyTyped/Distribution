package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAlignProps extends StObject {
  
  val textAlign: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ js.Any
    ]
  ] = js.undefined
}
object TextAlignProps {
  
  inline def apply(): TextAlignProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAlignProps]
  }
  
  extension [Self <: TextAlignProps](x: Self) {
    
    inline def setTextAlign(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ js.Any
        ]
    ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextAlignVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ js.Any)*
    ): Self = StObject.set(x, "textAlign", js.Array(value :_*))
  }
}
