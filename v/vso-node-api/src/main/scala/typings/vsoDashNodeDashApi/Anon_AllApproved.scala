package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllApproved extends js.Object {
  var all: Double
  var approved: Double
  var canceled: Double
  var cancelling: Double
  var deferred: Double
  var evaluatingGates: Double
  var gateFailed: Double
  var manualInterventionPending: Double
  var pending: Double
  var phaseCanceled: Double
  var phaseFailed: Double
  var phaseInProgress: Double
  var phasePartiallySucceeded: Double
  var phaseSucceeded: Double
  var queued: Double
  var queuedForAgent: Double
  var queuedForPipeline: Double
  var rejected: Double
  var scheduled: Double
  var undefined: Double
}

object Anon_AllApproved {
  @scala.inline
  def apply(
    all: Double,
    approved: Double,
    canceled: Double,
    cancelling: Double,
    deferred: Double,
    evaluatingGates: Double,
    gateFailed: Double,
    manualInterventionPending: Double,
    pending: Double,
    phaseCanceled: Double,
    phaseFailed: Double,
    phaseInProgress: Double,
    phasePartiallySucceeded: Double,
    phaseSucceeded: Double,
    queued: Double,
    queuedForAgent: Double,
    queuedForPipeline: Double,
    rejected: Double,
    scheduled: Double,
    undefined: Double
  ): Anon_AllApproved = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approved = approved.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], deferred = deferred.asInstanceOf[js.Any], evaluatingGates = evaluatingGates.asInstanceOf[js.Any], gateFailed = gateFailed.asInstanceOf[js.Any], manualInterventionPending = manualInterventionPending.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], phaseCanceled = phaseCanceled.asInstanceOf[js.Any], phaseFailed = phaseFailed.asInstanceOf[js.Any], phaseInProgress = phaseInProgress.asInstanceOf[js.Any], phasePartiallySucceeded = phasePartiallySucceeded.asInstanceOf[js.Any], phaseSucceeded = phaseSucceeded.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], queuedForAgent = queuedForAgent.asInstanceOf[js.Any], queuedForPipeline = queuedForPipeline.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllApproved]
  }
}

