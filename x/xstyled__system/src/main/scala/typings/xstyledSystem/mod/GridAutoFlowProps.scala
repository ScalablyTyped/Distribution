package typings.xstyledSystem.mod

import typings.csstype.mod.Property.GridAutoFlow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAutoFlowProps extends StObject {
  
  val gridAutoFlow: js.UndefOr[ResponsiveValue[GridAutoFlow]] = js.undefined
}
object GridAutoFlowProps {
  
  inline def apply(): GridAutoFlowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoFlowProps]
  }
  
  extension [Self <: GridAutoFlowProps](x: Self) {
    
    inline def setGridAutoFlow(value: ResponsiveValue[GridAutoFlow]): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
    
    inline def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
    
    inline def setGridAutoFlowVarargs(value: GridAutoFlow*): Self = StObject.set(x, "gridAutoFlow", js.Array(value*))
  }
}
