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
    val __obj = js.Dynamic.literal(completed = completed, declined = declined, inProgress = inProgress, notStarted = notStarted, paused = paused, unspecified = unspecified)
  
    __obj.asInstanceOf[Anon_CompletedDeclined]
  }
}

