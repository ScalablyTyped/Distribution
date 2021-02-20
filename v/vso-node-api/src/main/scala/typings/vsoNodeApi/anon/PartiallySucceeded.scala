package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartiallySucceeded extends StObject {
  
  var canceled: scala.Double = js.native
  
  var inProgress: scala.Double = js.native
  
  var notStarted: scala.Double = js.native
  
  var partiallySucceeded: scala.Double = js.native
  
  var queued: scala.Double = js.native
  
  var rejected: scala.Double = js.native
  
  var scheduled: scala.Double = js.native
  
  var succeeded: scala.Double = js.native
  
  var undefined: scala.Double = js.native
}
object PartiallySucceeded {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PartiallySucceededMutableBuilder[Self <: PartiallySucceeded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanceled(value: scala.Double): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotStarted(value: scala.Double): Self = StObject.set(x, "notStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartiallySucceeded(value: scala.Double): Self = StObject.set(x, "partiallySucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejected(value: scala.Double): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduled(value: scala.Double): Self = StObject.set(x, "scheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
