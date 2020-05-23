package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortedBySystem extends js.Object {
  var abortedBySystem: scala.Double
  var analyzed: scala.Double
  var canceledByUser: scala.Double
  var cancellationInProgress: scala.Double
  var creatingEnvironment: scala.Double
  var none: scala.Double
  var pendingAnalysis: scala.Double
  var runningTests: scala.Double
  var timedOut: scala.Double
}

object AbortedBySystem {
  @scala.inline
  def apply(
    abortedBySystem: scala.Double,
    analyzed: scala.Double,
    canceledByUser: scala.Double,
    cancellationInProgress: scala.Double,
    creatingEnvironment: scala.Double,
    none: scala.Double,
    pendingAnalysis: scala.Double,
    runningTests: scala.Double,
    timedOut: scala.Double
  ): AbortedBySystem = {
    val __obj = js.Dynamic.literal(abortedBySystem = abortedBySystem.asInstanceOf[js.Any], analyzed = analyzed.asInstanceOf[js.Any], canceledByUser = canceledByUser.asInstanceOf[js.Any], cancellationInProgress = cancellationInProgress.asInstanceOf[js.Any], creatingEnvironment = creatingEnvironment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pendingAnalysis = pendingAnalysis.asInstanceOf[js.Any], runningTests = runningTests.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortedBySystem]
  }
}

