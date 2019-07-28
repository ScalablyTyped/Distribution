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
    val __obj = js.Dynamic.literal(all = all, approved = approved, canceled = canceled, cancelling = cancelling, deferred = deferred, evaluatingGates = evaluatingGates, gateFailed = gateFailed, manualInterventionPending = manualInterventionPending, pending = pending, phaseCanceled = phaseCanceled, phaseFailed = phaseFailed, phaseInProgress = phaseInProgress, phasePartiallySucceeded = phasePartiallySucceeded, phaseSucceeded = phaseSucceeded, queued = queued, queuedForAgent = queuedForAgent, queuedForPipeline = queuedForPipeline, rejected = rejected, scheduled = scheduled, undefined = undefined)
  
    __obj.asInstanceOf[Anon_AllApproved]
  }
}

