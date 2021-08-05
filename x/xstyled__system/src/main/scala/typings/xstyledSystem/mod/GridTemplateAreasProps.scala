package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridTemplateAreasProps extends StObject {
  
  val gridTemplateAreas: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ js.Any
    ]
  ] = js.undefined
}
object GridTemplateAreasProps {
  
  inline def apply(): GridTemplateAreasProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateAreasProps]
  }
  
  extension [Self <: GridTemplateAreasProps](x: Self) {
    
    inline def setGridTemplateAreas(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ js.Any
        ]
    ): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
    
    inline def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
    
    inline def setGridTemplateAreasVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ js.Any)*
    ): Self = StObject.set(x, "gridTemplateAreas", js.Array(value :_*))
  }
}
