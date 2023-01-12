package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedInProgress extends StObject {
  
  var failed: scala.Double
  
  var inProgress: scala.Double
  
  var queued: scala.Double
  
  var succeeded: scala.Double
}
object FailedInProgress {
  
  inline def apply(failed: scala.Double, inProgress: scala.Double, queued: scala.Double, succeeded: scala.Double): FailedInProgress = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedInProgress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedInProgress] (val x: Self) extends AnyVal {
    
    inline def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    inline def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
