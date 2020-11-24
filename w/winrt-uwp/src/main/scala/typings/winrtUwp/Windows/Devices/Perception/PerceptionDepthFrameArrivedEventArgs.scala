package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a depth frame arrived event. */
@js.native
trait PerceptionDepthFrameArrivedEventArgs extends js.Object {
  
  /** Gets the relative time of this frame. */
  var relativeTime: Double = js.native
  
  /**
    * Attempts to open the depth frame that has arrived. Existing frames should be closed before opening new frames. If an app has three or more frames still open when this method is called, TryOpenFrame will fail.
    * @return If the attempt is successful, this method returns the newly-arrived depth frame. If the attempt is unsuccessful, this value is unchanged.
    */
  def tryOpenFrame(): PerceptionDepthFrame = js.native
}
object PerceptionDepthFrameArrivedEventArgs {
  
  @scala.inline
  def apply(relativeTime: Double, tryOpenFrame: () => PerceptionDepthFrame): PerceptionDepthFrameArrivedEventArgs = {
    val __obj = js.Dynamic.literal(relativeTime = relativeTime.asInstanceOf[js.Any], tryOpenFrame = js.Any.fromFunction0(tryOpenFrame))
    __obj.asInstanceOf[PerceptionDepthFrameArrivedEventArgs]
  }
  
  @scala.inline
  implicit class PerceptionDepthFrameArrivedEventArgsOps[Self <: PerceptionDepthFrameArrivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRelativeTime(value: Double): Self = this.set("relativeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryOpenFrame(value: () => PerceptionDepthFrame): Self = this.set("tryOpenFrame", js.Any.fromFunction0(value))
  }
}
