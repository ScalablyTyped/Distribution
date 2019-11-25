package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionErrorsEvent extends RealTimePullRequestEvent {
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
}

