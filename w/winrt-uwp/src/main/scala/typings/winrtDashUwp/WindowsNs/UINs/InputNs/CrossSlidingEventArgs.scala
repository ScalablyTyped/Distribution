package typings.winrtDashUwp.WindowsNs.UINs.InputNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.InputNs.PointerDeviceType
import typings.winrtDashUwp.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the CrossSliding event. */
@JSGlobal("Windows.UI.Input.CrossSlidingEventArgs")
@js.native
abstract class CrossSlidingEventArgs () extends js.Object {
  /** Gets the state of the CrossSliding event. */
  var crossSlidingState: CrossSlidingState = js.native
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the touch contact. */
  var position: Point = js.native
}

