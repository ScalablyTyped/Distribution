package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllBatchedContinuousIntegration extends js.Object {
  var all: scala.Double
  var batchedContinuousIntegration: scala.Double
  var batchedGatedCheckIn: scala.Double
  var continuousIntegration: scala.Double
  var gatedCheckIn: scala.Double
  var none: scala.Double
  var pullRequest: scala.Double
  var schedule: scala.Double
}

object Anon_AllBatchedContinuousIntegration {
  @scala.inline
  def apply(
    all: scala.Double,
    batchedContinuousIntegration: scala.Double,
    batchedGatedCheckIn: scala.Double,
    continuousIntegration: scala.Double,
    gatedCheckIn: scala.Double,
    none: scala.Double,
    pullRequest: scala.Double,
    schedule: scala.Double
  ): Anon_AllBatchedContinuousIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("batchedContinuousIntegration")(batchedContinuousIntegration)
    __obj.updateDynamic("batchedGatedCheckIn")(batchedGatedCheckIn)
    __obj.updateDynamic("continuousIntegration")(continuousIntegration)
    __obj.updateDynamic("gatedCheckIn")(gatedCheckIn)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("pullRequest")(pullRequest)
    __obj.updateDynamic("schedule")(schedule)
    __obj.asInstanceOf[Anon_AllBatchedContinuousIntegration]
  }
}

