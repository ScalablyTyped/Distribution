package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBatchedContinuousIntegration extends js.Object {
  var all: Double
  var batchedContinuousIntegration: Double
  var batchedGatedCheckIn: Double
  var continuousIntegration: Double
  var gatedCheckIn: Double
  var none: Double
  var pullRequest: Double
  var schedule: Double
}

object AnonBatchedContinuousIntegration {
  @scala.inline
  def apply(
    all: Double,
    batchedContinuousIntegration: Double,
    batchedGatedCheckIn: Double,
    continuousIntegration: Double,
    gatedCheckIn: Double,
    none: Double,
    pullRequest: Double,
    schedule: Double
  ): AnonBatchedContinuousIntegration = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], batchedContinuousIntegration = batchedContinuousIntegration.asInstanceOf[js.Any], batchedGatedCheckIn = batchedGatedCheckIn.asInstanceOf[js.Any], continuousIntegration = continuousIntegration.asInstanceOf[js.Any], gatedCheckIn = gatedCheckIn.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBatchedContinuousIntegration]
  }
}

