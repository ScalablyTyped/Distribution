package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletedFailed extends js.Object {
  var completed: scala.Double
  var failed: scala.Double
  var inprogress: scala.Double
  var skipped: scala.Double
}

object Anon_CompletedFailed {
  @scala.inline
  def apply(completed: scala.Double, failed: scala.Double, inprogress: scala.Double, skipped: scala.Double): Anon_CompletedFailed = {
    val __obj = js.Dynamic.literal(completed = completed, failed = failed, inprogress = inprogress, skipped = skipped)
  
    __obj.asInstanceOf[Anon_CompletedFailed]
  }
}

