package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ExampleCollection. */
trait ExampleCollection extends StObject {
  
  /** An array of objects describing the examples defined for the intent. */
  var examples: js.Array[Example]
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination
}
object ExampleCollection {
  
  inline def apply(examples: js.Array[Example], pagination: Pagination): ExampleCollection = {
    val __obj = js.Dynamic.literal(examples = examples.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleCollection]
  }
  
  extension [Self <: ExampleCollection](x: Self) {
    
    inline def setExamples(value: js.Array[Example]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesVarargs(value: Example*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
  }
}
