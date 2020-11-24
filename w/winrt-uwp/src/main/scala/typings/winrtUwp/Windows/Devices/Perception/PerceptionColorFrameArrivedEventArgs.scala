package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a color frame arrived event. */
@js.native
trait PerceptionColorFrameArrivedEventArgs extends js.Object {
  
  /** Gets the relative time of this frame. */
  var relativeTime: Double = js.native
  
  /**
    * Attempts to open the color frame that has arrived.
    * @return If the attempt is successful, this method returns the newly-arrived color frame. If the attempt is unsuccessful, this value is unchanged.
    */
  def tryOpenFrame(): PerceptionColorFrame = js.native
}
object PerceptionColorFrameArrivedEventArgs {
  
  @scala.inline
  def apply(relativeTime: Double, tryOpenFrame: () => PerceptionColorFrame): PerceptionColorFrameArrivedEventArgs = {
    val __obj = js.Dynamic.literal(relativeTime = relativeTime.asInstanceOf[js.Any], tryOpenFrame = js.Any.fromFunction0(tryOpenFrame))
    __obj.asInstanceOf[PerceptionColorFrameArrivedEventArgs]
  }
  
  @scala.inline
  implicit class PerceptionColorFrameArrivedEventArgsOps[Self <: PerceptionColorFrameArrivedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setTryOpenFrame(value: () => PerceptionColorFrame): Self = this.set("tryOpenFrame", js.Any.fromFunction0(value))
  }
}
