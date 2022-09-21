package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamedBatch[T] extends StObject {
  
  var continuationToken: String
  
  var isLastBatch: Boolean
  
  var nextLink: String
  
  var values: js.Array[T]
}
object StreamedBatch {
  
  inline def apply[T](continuationToken: String, isLastBatch: Boolean, nextLink: String, values: js.Array[T]): StreamedBatch[T] = {
    val __obj = js.Dynamic.literal(continuationToken = continuationToken.asInstanceOf[js.Any], isLastBatch = isLastBatch.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamedBatch[T]]
  }
  
  extension [Self <: StreamedBatch[?], T](x: Self & StreamedBatch[T]) {
    
    inline def setContinuationToken(value: String): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    inline def setIsLastBatch(value: Boolean): Self = StObject.set(x, "isLastBatch", value.asInstanceOf[js.Any])
    
    inline def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: T*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
