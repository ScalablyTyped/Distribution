package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsEvaluationResult extends StObject {
  
  /**
    * Count of events evaluated.
    */
  var count: Double = js.native
  
  /**
    * Count of matched events.
    */
  var matchedCount: Double = js.native
}
object EventsEvaluationResult {
  
  @scala.inline
  def apply(count: Double, matchedCount: Double): EventsEvaluationResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsEvaluationResult]
  }
  
  @scala.inline
  implicit class EventsEvaluationResultMutableBuilder[Self <: EventsEvaluationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedCount(value: Double): Self = StObject.set(x, "matchedCount", value.asInstanceOf[js.Any])
  }
}
