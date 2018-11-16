package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

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
  var pointerDeviceType: winrtDashUwpLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType = js.native
  /** Gets the location of the touch contact. */
  var position: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
}

