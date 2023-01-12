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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderProps] (val x: Self) extends AnyVal {
    
    inline def setOrder(value: ResponsiveValue[Order]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: Order*): Self = StObject.set(x, "order", js.Array(value*))
  }
}
