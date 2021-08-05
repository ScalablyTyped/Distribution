package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartiallySucceeded extends StObject {
  
  var canceled: scala.Double
  
  var inProgress: scala.Double
  
  var notStarted: scala.Double
  
  var partiallySucceeded: scala.Double
  
  var queued: scala.Double
  
  var rejected: scala.Double
  
  var scheduled: scala.Double
  
  var succeeded: scala.Double
  
  var undefined: scala.Double
}
object PartiallySucceeded {
  
  inline def apply(
    canceled: scala.Double,
    inProgress: scala.Double,
    notStarted: scala.Double,
    partiallySucceeded: scala.Double,
    queued: scala.Double,
    rejected: scala.Double,
    scheduled: scala.Double,
    succeeded: scala.Double,
    undefined: scala.Double
  ): PartiallySucceeded = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartiallySucceeded]
  }
  
  extension [Self <: PartiallySucceeded](x: Self) {
    
    inline def setCanceled(value: scala.Double): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    inline def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    inline def setNotStarted(value: scala.Double): Self = StObject.set(x, "notStarted", value.asInstanceOf[js.Any])
    
    inline def setPartiallySucceeded(value: scala.Double): Self = StObject.set(x, "partiallySucceeded", value.asInstanceOf[js.Any])
    
    inline def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    inline def setRejected(value: scala.Double): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
    
    inline def setScheduled(value: scala.Double): Self = StObject.set(x, "scheduled", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
