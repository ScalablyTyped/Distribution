package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllBatchedContinuousIntegration extends js.Object {
  var all: Double
  var batchedContinuousIntegration: Double
  var batchedGatedCheckIn: Double
  var continuousIntegration: Double
  var gatedCheckIn: Double
  var none: Double
  var pullRequest: Double
  var schedule: Double
}

object Anon_AllBatchedContinuousIntegration {
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
  ): Anon_AllBatchedContinuousIntegration = {
    val __obj = js.Dynamic.literal(all = all, batchedContinuousIntegration = batchedContinuousIntegration, batchedGatedCheckIn = batchedGatedCheckIn, continuousIntegration = continuousIntegration, gatedCheckIn = gatedCheckIn, none = none, pullRequest = pullRequest, schedule = schedule)
  
    __obj.asInstanceOf[Anon_AllBatchedContinuousIntegration]
  }
}

