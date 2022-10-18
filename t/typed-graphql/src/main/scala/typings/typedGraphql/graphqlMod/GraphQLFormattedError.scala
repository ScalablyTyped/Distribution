package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLFormattedError extends StObject {
  
  var locations: js.Array[GraphQLErrorLocation]
  
  var message: String
}
object GraphQLFormattedError {
  
  inline def apply(locations: js.Array[GraphQLErrorLocation], message: String): GraphQLFormattedError = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLFormattedError]
  }
  
  extension [Self <: GraphQLFormattedError](x: Self) {
    
    inline def setLocations(value: js.Array[GraphQLErrorLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsVarargs(value: GraphQLErrorLocation*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
