package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array of objects describing the entities for the workspace. */
@js.native
trait EntityCollection extends StObject {
  
  /** An array of objects describing the entities defined for the workspace. */
  var entities: js.Array[Entity] = js.native
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
}
object EntityCollection {
  
  @scala.inline
  def apply(entities: js.Array[Entity], pagination: Pagination): EntityCollection = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityCollection]
  }
  
  @scala.inline
  implicit class EntityCollectionMutableBuilder[Self <: EntityCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
  }
}
