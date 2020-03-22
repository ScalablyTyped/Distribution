package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancellingCompleted extends js.Object {
  var cancelling: Double
  var completed: Double
  var inProgress: Double
  var queued: Double
}

object AnonCancellingCompleted {
  @scala.inline
  def apply(cancelling: Double, completed: Double, inProgress: Double, queued: Double): AnonCancellingCompleted = {
    val __obj = js.Dynamic.literal(cancelling = cancelling.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancellingCompleted]
  }
}

