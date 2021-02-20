package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridTemplateAreasProps extends StObject {
  
  val gridTemplateAreas: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ _
    ]
  ] = js.native
}
object GridTemplateAreasProps {
  
  @scala.inline
  def apply(): GridTemplateAreasProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateAreasProps]
  }
  
  @scala.inline
  implicit class GridTemplateAreasPropsMutableBuilder[Self <: GridTemplateAreasProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridTemplateAreas(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ _
        ]
    ): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
    
    @scala.inline
    def setGridTemplateAreasVarargs(value: js.Any*): Self = StObject.set(x, "gridTemplateAreas", js.Array(value :_*))
  }
}
