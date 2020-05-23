package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchedContinuousIntegration extends js.Object {
  var all: scala.Double
  var batchedContinuousIntegration: scala.Double
  var batchedGatedCheckIn: scala.Double
  var continuousIntegration: scala.Double
  var gatedCheckIn: scala.Double
  var none: scala.Double
  var pullRequest: scala.Double
  var schedule: scala.Double
}

object BatchedContinuousIntegration {
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
  ): BatchedContinuousIntegration = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], batchedContinuousIntegration = batchedContinuousIntegration.asInstanceOf[js.Any], batchedGatedCheckIn = batchedGatedCheckIn.asInstanceOf[js.Any], continuousIntegration = continuousIntegration.asInstanceOf[js.Any], gatedCheckIn = gatedCheckIn.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchedContinuousIntegration]
  }
}

