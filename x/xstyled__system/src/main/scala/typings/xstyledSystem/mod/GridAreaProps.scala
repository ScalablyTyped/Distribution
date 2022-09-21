package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAreaProps extends StObject {
  
  // Number allowed here but is converted into px value, which is invalid.
  // readonly gridArea?: ResponsiveValue<CSS.Property.GridArea>;
  val gridArea: js.UndefOr[ResponsiveValue[String]] = js.undefined
}
object GridAreaProps {
  
  inline def apply(): GridAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAreaProps]
  }
  
  extension [Self <: GridAreaProps](x: Self) {
    
    inline def setGridArea(value: ResponsiveValue[String]): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
    
    inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
    
    inline def setGridAreaVarargs(value: String*): Self = StObject.set(x, "gridArea", js.Array(value*))
  }
}
