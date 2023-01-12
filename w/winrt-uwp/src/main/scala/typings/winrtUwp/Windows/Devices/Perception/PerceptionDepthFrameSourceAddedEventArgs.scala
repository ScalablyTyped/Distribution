package typings.winrtUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event data for depth frame source added events. */
trait PerceptionDepthFrameSourceAddedEventArgs extends StObject {
  
  /** Gets the depth frame source that was added. */
  var frameSource: PerceptionDepthFrameSource
}
object PerceptionDepthFrameSourceAddedEventArgs {
  
  inline def apply(frameSource: PerceptionDepthFrameSource): PerceptionDepthFrameSourceAddedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionDepthFrameSourceAddedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerceptionDepthFrameSourceAddedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setFrameSource(value: PerceptionDepthFrameSource): Self = StObject.set(x, "frameSource", value.asInstanceOf[js.Any])
  }
}
