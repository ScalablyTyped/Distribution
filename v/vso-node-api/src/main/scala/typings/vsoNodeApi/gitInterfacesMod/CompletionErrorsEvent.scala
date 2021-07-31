package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionErrorsEvent
  extends StObject
     with RealTimePullRequestEvent {
  
  /**
    * The error message associated with the completion error
    */
  var errorMessage: String
}
object CompletionErrorsEvent {
  
  @scala.inline
  def apply(errorMessage: String, eventId: String, pullRequestId: Double): CompletionErrorsEvent = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionErrorsEvent]
  }
  
  @scala.inline
  implicit class CompletionErrorsEventMutableBuilder[Self <: CompletionErrorsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}
