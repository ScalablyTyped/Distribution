package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryRelationsResponse. */
trait QueryRelationsResponse extends StObject {
  
  /** Array of relationships for the relations query. */
  var relations: js.UndefOr[js.Array[QueryRelationsRelationship]] = js.undefined
}
object QueryRelationsResponse {
  
  inline def apply(): QueryRelationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryRelationsResponse] (val x: Self) extends AnyVal {
    
    inline def setRelations(value: js.Array[QueryRelationsRelationship]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    inline def setRelationsVarargs(value: QueryRelationsRelationship*): Self = StObject.set(x, "relations", js.Array(value*))
  }
}
