package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array of objects describing the entities for the workspace. */
trait EntityCollection extends StObject {
  
  /** An array of objects describing the entities defined for the workspace. */
  var entities: js.Array[Entity]
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination
}
object EntityCollection {
  
  inline def apply(entities: js.Array[Entity], pagination: Pagination): EntityCollection = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityCollection]
  }
  
  extension [Self <: EntityCollection](x: Self) {
    
    inline def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    inline def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
  }
}
