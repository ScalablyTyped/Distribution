package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletedDeclined extends js.Object {
  var completed: scala.Double
  var declined: scala.Double
  var inProgress: scala.Double
  var notStarted: scala.Double
  var paused: scala.Double
  var unspecified: scala.Double
}

object Anon_CompletedDeclined {
  @scala.inline
  def apply(
    completed: scala.Double,
    declined: scala.Double,
    inProgress: scala.Double,
    notStarted: scala.Double,
    paused: scala.Double,
    unspecified: scala.Double
  ): Anon_CompletedDeclined = {
    val __obj = js.Dynamic.literal(completed = completed, declined = declined, inProgress = inProgress, notStarted = notStarted, paused = paused, unspecified = unspecified)
  
    __obj.asInstanceOf[Anon_CompletedDeclined]
  }
}

