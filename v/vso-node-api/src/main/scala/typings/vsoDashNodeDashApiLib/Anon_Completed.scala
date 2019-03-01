package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Completed extends js.Object {
  var completed: scala.Double
  var inProgress: scala.Double
  var pending: scala.Double
}

object Anon_Completed {
  @scala.inline
  def apply(completed: scala.Double, inProgress: scala.Double, pending: scala.Double): Anon_Completed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("completed")(completed)
    __obj.updateDynamic("inProgress")(inProgress)
    __obj.updateDynamic("pending")(pending)
    __obj.asInstanceOf[Anon_Completed]
  }
}

