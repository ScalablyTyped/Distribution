package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsEvaluationResult extends StObject {
  
  /**
    * Count of events evaluated.
    */
  var count: Double
  
  /**
    * Count of matched events.
    */
  var matchedCount: Double
}
object EventsEvaluationResult {
  
  inline def apply(count: Double, matchedCount: Double): EventsEvaluationResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsEvaluationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventsEvaluationResult] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setMatchedCount(value: Double): Self = StObject.set(x, "matchedCount", value.asInstanceOf[js.Any])
  }
}
