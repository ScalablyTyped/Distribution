package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the Holding event. */
@JSGlobal("Windows.UI.Input.HoldingEventArgs")
@js.native
abstract class HoldingEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.Input.HoldingEventArgs {
  
  /** Gets the state of the Holding event. */
  /* CompleteClass */
  var holdingState: typings.winrtUwp.Windows.UI.Input.HoldingState = js.native
  
  /** Gets the device type of the input source. */
  /* CompleteClass */
  var pointerDeviceType: PointerDeviceType = js.native
  
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  /* CompleteClass */
  var position: Point = js.native
}
