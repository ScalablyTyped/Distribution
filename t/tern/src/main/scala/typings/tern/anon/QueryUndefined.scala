package typings.tern.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryUndefined extends StObject {
  
  var query: Unit
}
object QueryUndefined {
  
  inline def apply(query: Unit): QueryUndefined = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryUndefined]
  }
  
  extension [Self <: QueryUndefined](x: Self) {
    
    inline def setQuery(value: Unit): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
