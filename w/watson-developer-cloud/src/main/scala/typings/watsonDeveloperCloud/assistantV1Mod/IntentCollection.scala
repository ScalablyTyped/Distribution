package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IntentCollection. */
trait IntentCollection extends StObject {
  
  /** An array of objects describing the intents defined for the workspace. */
  var intents: js.Array[Intent]
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination
}
object IntentCollection {
  
  inline def apply(intents: js.Array[Intent], pagination: Pagination): IntentCollection = {
    val __obj = js.Dynamic.literal(intents = intents.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentCollection]
  }
  
  extension [Self <: IntentCollection](x: Self) {
    
    inline def setIntents(value: js.Array[Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsVarargs(value: Intent*): Self = StObject.set(x, "intents", js.Array(value*))
    
    inline def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
  }
}
