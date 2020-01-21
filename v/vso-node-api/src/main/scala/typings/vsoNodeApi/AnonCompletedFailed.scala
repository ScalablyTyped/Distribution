package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompletedFailed extends js.Object {
  var completed: Double
  var failed: Double
  var inprogress: Double
  var skipped: Double
}

object AnonCompletedFailed {
  @scala.inline
  def apply(completed: Double, failed: Double, inprogress: Double, skipped: Double): AnonCompletedFailed = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inprogress = inprogress.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompletedFailed]
  }
}

