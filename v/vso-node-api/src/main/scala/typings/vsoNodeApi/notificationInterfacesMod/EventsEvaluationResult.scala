package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsEvaluationResult extends js.Object {
  
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
  implicit class EventsEvaluationResultOps[Self <: EventsEvaluationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedCount(value: Double): Self = this.set("matchedCount", value.asInstanceOf[js.Any])
  }
}
