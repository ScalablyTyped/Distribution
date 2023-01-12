package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deferred extends StObject {
  
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
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deferred] (val x: Self) extends AnyVal {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setApproved(value: scala.Double): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    inline def setCanceled(value: scala.Double): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    inline def setCancelling(value: scala.Double): Self = StObject.set(x, "cancelling", value.asInstanceOf[js.Any])
    
    inline def setDeferred(value: scala.Double): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    inline def setEvaluatingGates(value: scala.Double): Self = StObject.set(x, "evaluatingGates", value.asInstanceOf[js.Any])
    
    inline def setGateFailed(value: scala.Double): Self = StObject.set(x, "gateFailed", value.asInstanceOf[js.Any])
    
    inline def setManualInterventionPending(value: scala.Double): Self = StObject.set(x, "manualInterventionPending", value.asInstanceOf[js.Any])
    
    inline def setPending(value: scala.Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPhaseCanceled(value: scala.Double): Self = StObject.set(x, "phaseCanceled", value.asInstanceOf[js.Any])
    
    inline def setPhaseFailed(value: scala.Double): Self = StObject.set(x, "phaseFailed", value.asInstanceOf[js.Any])
    
    inline def setPhaseInProgress(value: scala.Double): Self = StObject.set(x, "phaseInProgress", value.asInstanceOf[js.Any])
    
    inline def setPhasePartiallySucceeded(value: scala.Double): Self = StObject.set(x, "phasePartiallySucceeded", value.asInstanceOf[js.Any])
    
    inline def setPhaseSucceeded(value: scala.Double): Self = StObject.set(x, "phaseSucceeded", value.asInstanceOf[js.Any])
    
    inline def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    inline def setQueuedForAgent(value: scala.Double): Self = StObject.set(x, "queuedForAgent", value.asInstanceOf[js.Any])
    
    inline def setQueuedForPipeline(value: scala.Double): Self = StObject.set(x, "queuedForPipeline", value.asInstanceOf[js.Any])
    
    inline def setRejected(value: scala.Double): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
    
    inline def setScheduled(value: scala.Double): Self = StObject.set(x, "scheduled", value.asInstanceOf[js.Any])
    
    inline def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
