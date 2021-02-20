package typings.winrtUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event data for depth frame source removed events. */
@js.native
trait PerceptionDepthFrameSourceRemovedEventArgs extends StObject {
  
  /** Gets the depth frame source that was removed. */
  var frameSource: PerceptionDepthFrameSource = js.native
}
object PerceptionDepthFrameSourceRemovedEventArgs {
  
  @scala.inline
  def apply(frameSource: PerceptionDepthFrameSource): PerceptionDepthFrameSourceRemovedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionDepthFrameSourceRemovedEventArgs]
  }
  
  @scala.inline
  implicit class PerceptionDepthFrameSourceRemovedEventArgsMutableBuilder[Self <: PerceptionDepthFrameSourceRemovedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameSource(value: PerceptionDepthFrameSource): Self = StObject.set(x, "frameSource", value.asInstanceOf[js.Any])
  }
}
