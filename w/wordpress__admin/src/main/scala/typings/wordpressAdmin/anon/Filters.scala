package typings.wordpressAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filters extends StObject {
  
  var filters: String
  
  var observe: String
  
  var order: String
  
  var orderby: String
  
  var query: String
}
object Filters {
  
  inline def apply(filters: String, observe: String, order: String, orderby: String, query: String): Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], observe = observe.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], orderby = orderby.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
  
  extension [Self <: Filters](x: Self) {
    
    inline def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setObserve(value: String): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderby(value: String): Self = StObject.set(x, "orderby", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
