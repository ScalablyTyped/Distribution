package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** EntityMentionCollection. */
trait EntityMentionCollection extends StObject {
  
  /** An array of objects describing the entity mentions defined for an entity. */
  var examples: js.Array[EntityMention]
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination
}
object EntityMentionCollection {
  
  inline def apply(examples: js.Array[EntityMention], pagination: Pagination): EntityMentionCollection = {
    val __obj = js.Dynamic.literal(examples = examples.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityMentionCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityMentionCollection] (val x: Self) extends AnyVal {
    
    inline def setExamples(value: js.Array[EntityMention]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesVarargs(value: EntityMention*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
  }
}
