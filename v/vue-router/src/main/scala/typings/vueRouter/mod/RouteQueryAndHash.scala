package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteQueryAndHash extends StObject {
  
  var hash: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[LocationQueryRaw] = js.undefined
}
object RouteQueryAndHash {
  
  inline def apply(): RouteQueryAndHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteQueryAndHash]
  }
  
  extension [Self <: RouteQueryAndHash](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setQuery(value: LocationQueryRaw): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
