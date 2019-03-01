package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllFailed extends js.Object {
  var all: scala.Double
  var failed: scala.Double
  var inProgress: scala.Double
  var notDeployed: scala.Double
  var partiallySucceeded: scala.Double
  var succeeded: scala.Double
  var undefined: scala.Double
}

object Anon_AllFailed {
  @scala.inline
  def apply(
    all: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notDeployed: scala.Double,
    partiallySucceeded: scala.Double,
    succeeded: scala.Double,
    undefined: scala.Double
  ): Anon_AllFailed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("inProgress")(inProgress)
    __obj.updateDynamic("notDeployed")(notDeployed)
    __obj.updateDynamic("partiallySucceeded")(partiallySucceeded)
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.updateDynamic("undefined")(undefined)
    __obj.asInstanceOf[Anon_AllFailed]
  }
}

