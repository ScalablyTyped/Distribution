package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking.InkPoint")
@js.native
class InkPoint protected () extends js.Object {
  /**
    * Creates a new InkPoint object used in the construction of an InkStroke .
    * @param position The screen coordinates for the InkPoint object.
    * @param pressure The pressure of the contact on the digitizer surface. The default is 0.5.
    */
  def this(position: Point, pressure: Double) = this()
  /** The X, Y coordinates of the InkPoint , in device-independent pixels (DIPs) relative to the upper left-hand corner of the inking area. */
  var position: Point = js.native
  var pressure: js.Any = js.native
}

