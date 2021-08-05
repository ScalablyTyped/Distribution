package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ValueCollection. */
trait ValueCollection extends StObject {
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination
  
  /** An array of entity values. */
  var values: js.Array[Value]
}
object ValueCollection {
  
  inline def apply(pagination: Pagination, values: js.Array[Value]): ValueCollection = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueCollection]
  }
  
  extension [Self <: ValueCollection](x: Self) {
    
    inline def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Value*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
