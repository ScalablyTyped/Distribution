package typings.tablestore.anon

import typings.tablestore.mod.EnumValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  var order: EnumValues[SORTORDERASC]
}
object Order {
  
  inline def apply(order: EnumValues[SORTORDERASC]): Order = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setOrder(value: EnumValues[SORTORDERASC]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
