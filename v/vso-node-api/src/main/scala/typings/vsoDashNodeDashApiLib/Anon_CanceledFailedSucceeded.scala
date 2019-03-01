package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanceledFailedSucceeded extends js.Object {
  var canceled: scala.Double
  var failed: scala.Double
  var succeeded: scala.Double
}

object Anon_CanceledFailedSucceeded {
  @scala.inline
  def apply(canceled: scala.Double, failed: scala.Double, succeeded: scala.Double): Anon_CanceledFailedSucceeded = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canceled")(canceled)
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.asInstanceOf[Anon_CanceledFailedSucceeded]
  }
}

