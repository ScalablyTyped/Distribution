package typings.tablestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingFields extends StObject {
  
  var routingFields: js.UndefOr[js.Array[String]] = js.undefined
  
  var routingPartitionSize: js.UndefOr[Any] = js.undefined
}
object RoutingFields {
  
  inline def apply(): RoutingFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoutingFields] (val x: Self) extends AnyVal {
    
    inline def setRoutingFields(value: js.Array[String]): Self = StObject.set(x, "routingFields", value.asInstanceOf[js.Any])
    
    inline def setRoutingFieldsUndefined: Self = StObject.set(x, "routingFields", js.undefined)
    
    inline def setRoutingFieldsVarargs(value: String*): Self = StObject.set(x, "routingFields", js.Array(value*))
    
    inline def setRoutingPartitionSize(value: Any): Self = StObject.set(x, "routingPartitionSize", value.asInstanceOf[js.Any])
    
    inline def setRoutingPartitionSizeUndefined: Self = StObject.set(x, "routingPartitionSize", js.undefined)
  }
}
