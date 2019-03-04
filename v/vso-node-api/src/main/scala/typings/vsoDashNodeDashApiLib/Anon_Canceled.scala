package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Canceled extends js.Object {
  var canceled: scala.Double
  var failed: scala.Double
  var none: scala.Double
  var partiallySucceeded: scala.Double
  var succeeded: scala.Double
}

object Anon_Canceled {
  @scala.inline
  def apply(
    canceled: scala.Double,
    failed: scala.Double,
    none: scala.Double,
    partiallySucceeded: scala.Double,
    succeeded: scala.Double
  ): Anon_Canceled = {
    val __obj = js.Dynamic.literal(canceled = canceled, failed = failed, none = none, partiallySucceeded = partiallySucceeded, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_Canceled]
  }
}

