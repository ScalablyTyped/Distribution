package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbandonedCompleted extends js.Object {
  var abandoned: Double
  var completed: Double
  var failed: Double
  var inProgress: Double
  var queued: Double
}

object Anon_AbandonedCompleted {
  @scala.inline
  def apply(abandoned: Double, completed: Double, failed: Double, inProgress: Double, queued: Double): Anon_AbandonedCompleted = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AbandonedCompleted]
  }
}

