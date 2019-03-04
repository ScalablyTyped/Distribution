package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailed extends js.Object {
  var error: scala.Double
  var failed: scala.Double
  var notApplicable: scala.Double
  var notSet: scala.Double
  var pending: scala.Double
  var succeeded: scala.Double
}

object Anon_ErrorFailed {
  @scala.inline
  def apply(
    error: scala.Double,
    failed: scala.Double,
    notApplicable: scala.Double,
    notSet: scala.Double,
    pending: scala.Double,
    succeeded: scala.Double
  ): Anon_ErrorFailed = {
    val __obj = js.Dynamic.literal(error = error, failed = failed, notApplicable = notApplicable, notSet = notSet, pending = pending, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_ErrorFailed]
  }
}

