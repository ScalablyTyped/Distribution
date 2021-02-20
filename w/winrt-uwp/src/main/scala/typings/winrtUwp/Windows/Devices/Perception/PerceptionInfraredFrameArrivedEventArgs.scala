package typings.winrtUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a infrared frame arrived event. */
@js.native
trait PerceptionInfraredFrameArrivedEventArgs extends StObject {
  
  /** Gets the relative time of this frame. */
  var relativeTime: Double = js.native
  
  /**
    * Attempts to open the infrared frame that has arrived.
    * @return If the attempt is successful, this method returns the newly-arrived infrared frame. If the attempt is unsuccessful, this value is unchanged.
    */
  def tryOpenFrame(): PerceptionInfraredFrame = js.native
}
object PerceptionInfraredFrameArrivedEventArgs {
  
  @scala.inline
  def apply(relativeTime: Double, tryOpenFrame: () => PerceptionInfraredFrame): PerceptionInfraredFrameArrivedEventArgs = {
    val __obj = js.Dynamic.literal(relativeTime = relativeTime.asInstanceOf[js.Any], tryOpenFrame = js.Any.fromFunction0(tryOpenFrame))
    __obj.asInstanceOf[PerceptionInfraredFrameArrivedEventArgs]
  }
  
  @scala.inline
  implicit class PerceptionInfraredFrameArrivedEventArgsMutableBuilder[Self <: PerceptionInfraredFrameArrivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelativeTime(value: Double): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryOpenFrame(value: () => PerceptionInfraredFrame): Self = StObject.set(x, "tryOpenFrame", js.Any.fromFunction0(value))
  }
}
