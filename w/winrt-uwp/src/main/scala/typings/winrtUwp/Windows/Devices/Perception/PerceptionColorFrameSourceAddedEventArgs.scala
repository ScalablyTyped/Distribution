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
  
  inline def apply(frameSource: PerceptionColorFrameSource): PerceptionColorFrameSourceAddedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionColorFrameSourceAddedEventArgs]
  }
  
  extension [Self <: PerceptionColorFrameSourceAddedEventArgs](x: Self) {
    
    inline def setFrameSource(value: PerceptionColorFrameSource): Self = StObject.set(x, "frameSource", value.asInstanceOf[js.Any])
  }
}
