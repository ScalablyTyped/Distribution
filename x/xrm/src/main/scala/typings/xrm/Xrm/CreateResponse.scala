package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the WebAPI CreateRecord request response
  */
trait CreateResponse extends StObject {
  
  var entityType: String
  
  var id: String
}
object CreateResponse {
  
  inline def apply(entityType: String, id: String): CreateResponse = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateResponse] (val x: Self) extends AnyVal {
    
    inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
