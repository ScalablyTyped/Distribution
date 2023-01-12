package typings.xstyledSystem.mod

import typings.csstype.mod.Property.GridTemplateAreas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridTemplateAreasProps extends StObject {
  
  val gridTemplateAreas: js.UndefOr[ResponsiveValue[GridTemplateAreas]] = js.undefined
}
object GridTemplateAreasProps {
  
  inline def apply(): GridTemplateAreasProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateAreasProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridTemplateAreasProps] (val x: Self) extends AnyVal {
    
    inline def setGridTemplateAreas(value: ResponsiveValue[GridTemplateAreas]): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
    
    inline def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
    
    inline def setGridTemplateAreasVarargs(value: GridTemplateAreas*): Self = StObject.set(x, "gridTemplateAreas", js.Array(value*))
  }
}
