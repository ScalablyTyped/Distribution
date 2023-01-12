package typings.winrtUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a infrared frame arrived event. */
trait PerceptionInfraredFrameArrivedEventArgs extends StObject {
  
  /** Gets the relative time of this frame. */
  var relativeTime: Double
  
  /**
    * Attempts to open the infrared frame that has arrived.
    * @return If the attempt is successful, this method returns the newly-arrived infrared frame. If the attempt is unsuccessful, this value is unchanged.
    */
  def tryOpenFrame(): PerceptionInfraredFrame
}
object PerceptionInfraredFrameArrivedEventArgs {
  
  inline def apply(relativeTime: Double, tryOpenFrame: () => PerceptionInfraredFrame): PerceptionInfraredFrameArrivedEventArgs = {
    val __obj = js.Dynamic.literal(relativeTime = relativeTime.asInstanceOf[js.Any], tryOpenFrame = js.Any.fromFunction0(tryOpenFrame))
    __obj.asInstanceOf[PerceptionInfraredFrameArrivedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerceptionInfraredFrameArrivedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setRelativeTime(value: Double): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
    inline def setTryOpenFrame(value: () => PerceptionInfraredFrame): Self = StObject.set(x, "tryOpenFrame", js.Any.fromFunction0(value))
  }
}
