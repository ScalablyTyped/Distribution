package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailed extends js.Object {
  var error: Double
  var failed: Double
  var notApplicable: Double
  var notSet: Double
  var pending: Double
  var succeeded: Double
}

object Anon_ErrorFailed {
  @scala.inline
  def apply(
    error: Double,
    failed: Double,
    notApplicable: Double,
    notSet: Double,
    pending: Double,
    succeeded: Double
  ): Anon_ErrorFailed = {
    val __obj = js.Dynamic.literal(error = error, failed = failed, notApplicable = notApplicable, notSet = notSet, pending = pending, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_ErrorFailed]
  }
}

