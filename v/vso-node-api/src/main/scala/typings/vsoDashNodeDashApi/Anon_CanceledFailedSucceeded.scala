package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanceledFailedSucceeded extends js.Object {
  var canceled: Double
  var failed: Double
  var succeeded: Double
}

object Anon_CanceledFailedSucceeded {
  @scala.inline
  def apply(canceled: Double, failed: Double, succeeded: Double): Anon_CanceledFailedSucceeded = {
    val __obj = js.Dynamic.literal(canceled = canceled, failed = failed, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_CanceledFailedSucceeded]
  }
}

