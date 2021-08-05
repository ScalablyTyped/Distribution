package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAutoFlowProps extends StObject {
  
  val gridAutoFlow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ js.Any
    ]
  ] = js.undefined
}
object GridAutoFlowProps {
  
  inline def apply(): GridAutoFlowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoFlowProps]
  }
  
  extension [Self <: GridAutoFlowProps](x: Self) {
    
    inline def setGridAutoFlow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ js.Any
        ]
    ): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
    
    inline def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
    
    inline def setGridAutoFlowVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ js.Any)*
    ): Self = StObject.set(x, "gridAutoFlow", js.Array(value :_*))
  }
}
