package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the type of user input that triggered the edge gesture event. */
@JSGlobal("Windows.UI.Input.EdgeGestureEventArgs")
@js.native
abstract class EdgeGestureEventArgs () extends js.Object {
  /** Gets the type of user input that triggered the edge gesture event. */
  var kind: EdgeGestureKind = js.native
}

