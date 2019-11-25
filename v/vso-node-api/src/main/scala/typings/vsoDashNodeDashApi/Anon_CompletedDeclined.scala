package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletedDeclined extends js.Object {
  var completed: Double
  var declined: Double
  var inProgress: Double
  var notStarted: Double
  var paused: Double
  var unspecified: Double
}

object Anon_CompletedDeclined {
  @scala.inline
  def apply(
    completed: Double,
    declined: Double,
    inProgress: Double,
    notStarted: Double,
    paused: Double,
    unspecified: Double
  ): Anon_CompletedDeclined = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], declined = declined.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CompletedDeclined]
  }
}

