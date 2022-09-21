package typings.xstyledSystem.mod

import typings.csstype.mod.Property.FlexWrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexWrapProps extends StObject {
  
  val flexWrap: js.UndefOr[ResponsiveValue[FlexWrap]] = js.undefined
}
object FlexWrapProps {
  
  inline def apply(): FlexWrapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexWrapProps]
  }
  
  extension [Self <: FlexWrapProps](x: Self) {
    
    inline def setFlexWrap(value: ResponsiveValue[FlexWrap]): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
    
    inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
    
    inline def setFlexWrapVarargs(value: FlexWrap*): Self = StObject.set(x, "flexWrap", js.Array(value*))
  }
}
