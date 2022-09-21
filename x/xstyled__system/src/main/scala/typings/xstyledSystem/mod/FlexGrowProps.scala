package typings.xstyledSystem.mod

import typings.csstype.mod.Property.FlexGrow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexGrowProps extends StObject {
  
  val flexGrow: js.UndefOr[ResponsiveValue[FlexGrow]] = js.undefined
}
object FlexGrowProps {
  
  inline def apply(): FlexGrowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexGrowProps]
  }
  
  extension [Self <: FlexGrowProps](x: Self) {
    
    inline def setFlexGrow(value: ResponsiveValue[FlexGrow]): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    inline def setFlexGrowVarargs(value: FlexGrow*): Self = StObject.set(x, "flexGrow", js.Array(value*))
  }
}
