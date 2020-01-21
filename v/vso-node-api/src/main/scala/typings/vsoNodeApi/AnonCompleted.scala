package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompleted extends js.Object {
  var completed: Double
  var inProgress: Double
  var pending: Double
}

object AnonCompleted {
  @scala.inline
  def apply(completed: Double, inProgress: Double, pending: Double): AnonCompleted = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompleted]
  }
}

