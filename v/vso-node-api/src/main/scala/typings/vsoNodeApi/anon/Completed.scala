package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Completed extends js.Object {
  var completed: scala.Double
  var inProgress: scala.Double
  var pending: scala.Double
}

object Completed {
  @scala.inline
  def apply(completed: scala.Double, inProgress: scala.Double, pending: scala.Double): Completed = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Completed]
  }
}

