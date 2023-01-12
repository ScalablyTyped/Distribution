package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveQueryDescriptor extends StObject {
  
  var indexName: String
  
  var last_event_id: Double
  
  var queryExpression: String
  
  var queryUri: String
  
  var sid: String
}
object LiveQueryDescriptor {
  
  inline def apply(indexName: String, last_event_id: Double, queryExpression: String, queryUri: String, sid: String): LiveQueryDescriptor = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], last_event_id = last_event_id.asInstanceOf[js.Any], queryExpression = queryExpression.asInstanceOf[js.Any], queryUri = queryUri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveQueryDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveQueryDescriptor] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setLast_event_id(value: Double): Self = StObject.set(x, "last_event_id", value.asInstanceOf[js.Any])
    
    inline def setQueryExpression(value: String): Self = StObject.set(x, "queryExpression", value.asInstanceOf[js.Any])
    
    inline def setQueryUri(value: String): Self = StObject.set(x, "queryUri", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
  }
}
