package typings.xstyledSystem.mod

import typings.csstype.mod.Property.Order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderProps extends StObject {
  
  val order: js.UndefOr[ResponsiveValue[Order]] = js.undefined
}
object OrderProps {
  
  inline def apply(): OrderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderProps]
  }
  
  extension [Self <: OrderProps](x: Self) {
    
    inline def setOrder(value: ResponsiveValue[Order]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: Order*): Self = StObject.set(x, "order", js.Array(value*))
  }
}
