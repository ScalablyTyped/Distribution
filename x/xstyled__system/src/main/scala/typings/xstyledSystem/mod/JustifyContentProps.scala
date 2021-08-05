package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JustifyContentProps extends StObject {
  
  val justifyContent: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ js.Any
    ]
  ] = js.undefined
}
object JustifyContentProps {
  
  inline def apply(): JustifyContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyContentProps]
  }
  
  extension [Self <: JustifyContentProps](x: Self) {
    
    inline def setJustifyContent(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ js.Any
        ]
    ): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    inline def setJustifyContentVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ js.Any)*
    ): Self = StObject.set(x, "justifyContent", js.Array(value :_*))
  }
}
