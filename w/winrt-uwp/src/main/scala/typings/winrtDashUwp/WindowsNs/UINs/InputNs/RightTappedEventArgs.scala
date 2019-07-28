package typings.winrtDashUwp.WindowsNs.UINs.InputNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.InputNs.PointerDeviceType
import typings.winrtDashUwp.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the RightTapped event. */
@JSGlobal("Windows.UI.Input.RightTappedEventArgs")
@js.native
abstract class RightTappedEventArgs () extends js.Object {
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  var position: Point = js.native
}

