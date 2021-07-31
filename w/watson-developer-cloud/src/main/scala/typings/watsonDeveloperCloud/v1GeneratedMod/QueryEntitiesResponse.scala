package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object that contains an array of entities resulting from the query. */
trait QueryEntitiesResponse extends StObject {
  
  /** Array of entities that results from the query. */
  var entities: js.UndefOr[js.Array[QueryEntitiesResponseItem]] = js.undefined
}
object QueryEntitiesResponse {
  
  @scala.inline
  def apply(): QueryEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEntitiesResponse]
  }
  
  @scala.inline
  implicit class QueryEntitiesResponseMutableBuilder[Self <: QueryEntitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[QueryEntitiesResponseItem]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: QueryEntitiesResponseItem*): Self = StObject.set(x, "entities", js.Array(value :_*))
  }
}
