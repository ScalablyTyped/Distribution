package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelledFailed extends StObject {
  
  var cancelled: scala.Double = js.native
  
  var failed: scala.Double = js.native
  
  var inProgress: scala.Double = js.native
  
  var notSet: scala.Double = js.native
  
  var queued: scala.Double = js.native
  
  var succeeded: scala.Double = js.native
}
object CancelledFailed {
  
  @scala.inline
  def apply(
    cancelled: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notSet: scala.Double,
    queued: scala.Double,
    succeeded: scala.Double
  ): CancelledFailed = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelledFailed]
  }
  
  @scala.inline
  implicit class CancelledFailedMutableBuilder[Self <: CancelledFailed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelled(value: scala.Double): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSet(value: scala.Double): Self = StObject.set(x, "notSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
