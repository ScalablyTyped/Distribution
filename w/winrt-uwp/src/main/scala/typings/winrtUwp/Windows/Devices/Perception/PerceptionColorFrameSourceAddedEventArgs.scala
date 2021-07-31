package typings.winrtUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event data for color frame source added events. */
trait PerceptionColorFrameSourceAddedEventArgs extends StObject {
  
  /** Gets the color frame source that was added. */
  var frameSource: PerceptionColorFrameSource
}
object PerceptionColorFrameSourceAddedEventArgs {
  
  @scala.inline
  def apply(frameSource: PerceptionColorFrameSource): PerceptionColorFrameSourceAddedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionColorFrameSourceAddedEventArgs]
  }
  
  @scala.inline
  implicit class PerceptionColorFrameSourceAddedEventArgsMutableBuilder[Self <: PerceptionColorFrameSourceAddedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameSource(value: PerceptionColorFrameSource): Self = StObject.set(x, "frameSource", value.asInstanceOf[js.Any])
  }
}
