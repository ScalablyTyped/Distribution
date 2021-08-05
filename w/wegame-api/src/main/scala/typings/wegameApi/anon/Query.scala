package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  var query: js.Any
  
  var scene: String
  
  var shareTicket: String
}
object Query {
  
  inline def apply(query: js.Any, scene: String, shareTicket: String): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setScene(value: String): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
  }
}
