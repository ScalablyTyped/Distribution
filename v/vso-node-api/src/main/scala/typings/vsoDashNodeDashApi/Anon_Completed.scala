package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Completed extends js.Object {
  var completed: Double
  var inProgress: Double
  var pending: Double
}

object Anon_Completed {
  @scala.inline
  def apply(completed: Double, inProgress: Double, pending: Double): Anon_Completed = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Completed]
  }
}

