package typings.winrtUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a color frame arrived event. */
trait PerceptionColorFrameArrivedEventArgs extends StObject {
  
  /** Gets the relative time of this frame. */
  var relativeTime: Double
  
  /**
    * Attempts to open the color frame that has arrived.
    * @return If the attempt is successful, this method returns the newly-arrived color frame. If the attempt is unsuccessful, this value is unchanged.
    */
  def tryOpenFrame(): PerceptionColorFrame
}
object PerceptionColorFrameArrivedEventArgs {
  
  @scala.inline
  def apply(relativeTime: Double, tryOpenFrame: () => PerceptionColorFrame): PerceptionColorFrameArrivedEventArgs = {
    val __obj = js.Dynamic.literal(relativeTime = relativeTime.asInstanceOf[js.Any], tryOpenFrame = js.Any.fromFunction0(tryOpenFrame))
    __obj.asInstanceOf[PerceptionColorFrameArrivedEventArgs]
  }
  
  @scala.inline
  implicit class PerceptionColorFrameArrivedEventArgsMutableBuilder[Self <: PerceptionColorFrameArrivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelativeTime(value: Double): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryOpenFrame(value: () => PerceptionColorFrame): Self = StObject.set(x, "tryOpenFrame", js.Any.fromFunction0(value))
  }
}
