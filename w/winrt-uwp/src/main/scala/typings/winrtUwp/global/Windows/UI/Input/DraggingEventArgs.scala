package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the Dragging event. */
/* note: abstract class */ @JSGlobal("Windows.UI.Input.DraggingEventArgs")
@js.native
open class DraggingEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.Input.DraggingEventArgs {
  
  /** Gets the state of the Dragging event. */
  /* CompleteClass */
  var draggingState: typings.winrtUwp.Windows.UI.Input.DraggingState = js.native
  
  /** Gets the device type of the input source. */
  /* CompleteClass */
  var pointerDeviceType: PointerDeviceType = js.native
  
  /** Gets the location of the mouse or pen/stylus contact. */
  /* CompleteClass */
  var position: Point = js.native
}
