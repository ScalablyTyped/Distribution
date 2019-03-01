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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canceled")(canceled)
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("partiallySucceeded")(partiallySucceeded)
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.asInstanceOf[Anon_Canceled]
  }
}

