package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the WebAPI RetrieveMultiple request response
  */
@js.native
trait RetrieveMultipleResult extends StObject {
  
  /**
    * An array of JSON objects, where each object represents the retrieved entity record containing attributes and their values as key: value pairs. The Id of the entity record is retrieved by default.
    */
  var entities: js.Array[_] = js.native
  
  /**
    * If the number of records being retrieved is more than the value specified in the maxPageSize parameter, this attribute returns the URL to return next set of records.
    */
  var nextLink: String = js.native
}
object RetrieveMultipleResult {
  
  @scala.inline
  def apply(entities: js.Array[_], nextLink: String): RetrieveMultipleResult = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveMultipleResult]
  }
  
  @scala.inline
  implicit class RetrieveMultipleResultMutableBuilder[Self <: RetrieveMultipleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[_]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: js.Any*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
  }
}
