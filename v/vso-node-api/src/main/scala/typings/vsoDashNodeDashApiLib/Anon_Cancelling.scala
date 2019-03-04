package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancelling extends js.Object {
  var cancelling: scala.Double
  var completed: scala.Double
  var inProgress: scala.Double
  var queued: scala.Double
}

object Anon_Cancelling {
  @scala.inline
  def apply(cancelling: scala.Double, completed: scala.Double, inProgress: scala.Double, queued: scala.Double): Anon_Cancelling = {
    val __obj = js.Dynamic.literal(cancelling = cancelling, completed = completed, inProgress = inProgress, queued = queued)
  
    __obj.asInstanceOf[Anon_Cancelling]
  }
}

