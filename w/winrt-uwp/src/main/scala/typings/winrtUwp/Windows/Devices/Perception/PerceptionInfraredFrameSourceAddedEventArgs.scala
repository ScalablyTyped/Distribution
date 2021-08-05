package typings.winrtUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event data for infrared frame source added events. */
trait PerceptionInfraredFrameSourceAddedEventArgs extends StObject {
  
  /** Gets the infrared frame source that was added. */
  var frameSource: PerceptionInfraredFrameSource
}
object PerceptionInfraredFrameSourceAddedEventArgs {
  
  inline def apply(frameSource: PerceptionInfraredFrameSource): PerceptionInfraredFrameSourceAddedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionInfraredFrameSourceAddedEventArgs]
  }
  
  extension [Self <: PerceptionInfraredFrameSourceAddedEventArgs](x: Self) {
    
    inline def setFrameSource(value: PerceptionInfraredFrameSource): Self = StObject.set(x, "frameSource", value.asInstanceOf[js.Any])
  }
}
