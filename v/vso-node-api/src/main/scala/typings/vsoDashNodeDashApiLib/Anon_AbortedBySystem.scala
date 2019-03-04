package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbortedBySystem extends js.Object {
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

object Anon_AbortedBySystem {
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
  ): Anon_AbortedBySystem = {
    val __obj = js.Dynamic.literal(abortedBySystem = abortedBySystem, analyzed = analyzed, canceledByUser = canceledByUser, cancellationInProgress = cancellationInProgress, creatingEnvironment = creatingEnvironment, none = none, pendingAnalysis = pendingAnalysis, runningTests = runningTests, timedOut = timedOut)
  
    __obj.asInstanceOf[Anon_AbortedBySystem]
  }
}

