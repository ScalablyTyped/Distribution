package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferred extends js.Object {
  var all: scala.Double
  var approved: scala.Double
  var canceled: scala.Double
  var cancelling: scala.Double
  var deferred: scala.Double
  var evaluatingGates: scala.Double
  var gateFailed: scala.Double
  var manualInterventionPending: scala.Double
  var pending: scala.Double
  var phaseCanceled: scala.Double
  var phaseFailed: scala.Double
  var phaseInProgress: scala.Double
  var phasePartiallySucceeded: scala.Double
  var phaseSucceeded: scala.Double
  var queued: scala.Double
  var queuedForAgent: scala.Double
  var queuedForPipeline: scala.Double
  var rejected: scala.Double
  var scheduled: scala.Double
  var undefined: scala.Double
}

object Deferred {
  @scala.inline
  def apply(
    all: scala.Double,
    approved: scala.Double,
    canceled: scala.Double,
    cancelling: scala.Double,
    deferred: scala.Double,
    evaluatingGates: scala.Double,
    gateFailed: scala.Double,
    manualInterventionPending: scala.Double,
    pending: scala.Double,
    phaseCanceled: scala.Double,
    phaseFailed: scala.Double,
    phaseInProgress: scala.Double,
    phasePartiallySucceeded: scala.Double,
    phaseSucceeded: scala.Double,
    queued: scala.Double,
    queuedForAgent: scala.Double,
    queuedForPipeline: scala.Double,
    rejected: scala.Double,
    scheduled: scala.Double,
    undefined: scala.Double
  ): Deferred = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approved = approved.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], deferred = deferred.asInstanceOf[js.Any], evaluatingGates = evaluatingGates.asInstanceOf[js.Any], gateFailed = gateFailed.asInstanceOf[js.Any], manualInterventionPending = manualInterventionPending.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], phaseCanceled = phaseCanceled.asInstanceOf[js.Any], phaseFailed = phaseFailed.asInstanceOf[js.Any], phaseInProgress = phaseInProgress.asInstanceOf[js.Any], phasePartiallySucceeded = phasePartiallySucceeded.asInstanceOf[js.Any], phaseSucceeded = phaseSucceeded.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], queuedForAgent = queuedForAgent.asInstanceOf[js.Any], queuedForPipeline = queuedForPipeline.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deferred]
  }
}

