package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryRelationsResponse. */
@js.native
trait QueryRelationsResponse extends StObject {
  
  /** Array of relationships for the relations query. */
  var relations: js.UndefOr[js.Array[QueryRelationsRelationship]] = js.native
}
object QueryRelationsResponse {
  
  @scala.inline
  def apply(): QueryRelationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsResponse]
  }
  
  @scala.inline
  implicit class QueryRelationsResponseMutableBuilder[Self <: QueryRelationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelations(value: js.Array[QueryRelationsRelationship]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    @scala.inline
    def setRelationsVarargs(value: QueryRelationsRelationship*): Self = StObject.set(x, "relations", js.Array(value :_*))
  }
}
