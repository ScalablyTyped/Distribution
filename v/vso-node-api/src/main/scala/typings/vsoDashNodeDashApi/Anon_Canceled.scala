package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Canceled extends js.Object {
  var canceled: Double
  var failed: Double
  var none: Double
  var partiallySucceeded: Double
  var succeeded: Double
}

object Anon_Canceled {
  @scala.inline
  def apply(canceled: Double, failed: Double, none: Double, partiallySucceeded: Double, succeeded: Double): Anon_Canceled = {
    val __obj = js.Dynamic.literal(canceled = canceled, failed = failed, none = none, partiallySucceeded = partiallySucceeded, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_Canceled]
  }
}

