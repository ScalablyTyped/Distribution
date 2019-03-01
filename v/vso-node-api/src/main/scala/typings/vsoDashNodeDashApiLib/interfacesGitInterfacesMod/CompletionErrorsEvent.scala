package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionErrorsEvent extends RealTimePullRequestEvent {
  /**
    * The error message associated with the completion error
    */
  var errorMessage: java.lang.String
}

object CompletionErrorsEvent {
  @scala.inline
  def apply(errorMessage: java.lang.String, eventId: java.lang.String, pullRequestId: scala.Double): CompletionErrorsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("eventId")(eventId)
    __obj.updateDynamic("pullRequestId")(pullRequestId)
    __obj.asInstanceOf[CompletionErrorsEvent]
  }
}

