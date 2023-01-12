package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotFound extends StObject {
  
  var cancelled: scala.Double
  
  var failed: scala.Double
  
  var inProgress: scala.Double
  
  var notFound: scala.Double
  
  var notSet: scala.Double
  
  var queued: scala.Double
  
  var succeeded: scala.Double
  
  var timedOut: scala.Double
}
object NotFound {
  
  inline def apply(
    cancelled: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notFound: scala.Double,
    notSet: scala.Double,
    queued: scala.Double,
    succeeded: scala.Double,
    timedOut: scala.Double
  ): NotFound = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotFound]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotFound] (val x: Self) extends AnyVal {
    
    inline def setCancelled(value: scala.Double): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    inline def setNotFound(value: scala.Double): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    inline def setNotSet(value: scala.Double): Self = StObject.set(x, "notSet", value.asInstanceOf[js.Any])
    
    inline def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setTimedOut(value: scala.Double): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
  }
}
