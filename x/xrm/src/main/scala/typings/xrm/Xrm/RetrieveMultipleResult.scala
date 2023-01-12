package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the WebAPI RetrieveMultiple request response
  */
trait RetrieveMultipleResult extends StObject {
  
  /**
    * An array of JSON objects, where each object represents the retrieved entity record containing attributes and their values as key: value pairs. The Id of the entity record is retrieved by default.
    */
  var entities: js.Array[Any]
  
  /**
    * If the number of records being retrieved is more than the value specified in the maxPageSize parameter, this attribute returns the URL to return next set of records.
    */
  var nextLink: String
}
object RetrieveMultipleResult {
  
  inline def apply(entities: js.Array[Any], nextLink: String): RetrieveMultipleResult = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveMultipleResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetrieveMultipleResult] (val x: Self) extends AnyVal {
    
    inline def setEntities(value: js.Array[Any]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: Any*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
  }
}
