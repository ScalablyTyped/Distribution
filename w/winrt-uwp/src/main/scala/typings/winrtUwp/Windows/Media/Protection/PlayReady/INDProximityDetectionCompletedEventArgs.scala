package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides arguments for the PlayReady-ND ProximityDetectionCompleted event. Apps fire this event after they complete the proximity detection process. */
trait INDProximityDetectionCompletedEventArgs extends StObject {
  
  /** Gets the number of retries that occurred during a proximity detection operation. */
  var proximityDetectionRetryCount: Double
}
object INDProximityDetectionCompletedEventArgs {
  
  @scala.inline
  def apply(proximityDetectionRetryCount: Double): INDProximityDetectionCompletedEventArgs = {
    val __obj = js.Dynamic.literal(proximityDetectionRetryCount = proximityDetectionRetryCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDProximityDetectionCompletedEventArgs]
  }
  
  @scala.inline
  implicit class INDProximityDetectionCompletedEventArgsMutableBuilder[Self <: INDProximityDetectionCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProximityDetectionRetryCount(value: Double): Self = StObject.set(x, "proximityDetectionRetryCount", value.asInstanceOf[js.Any])
  }
}
