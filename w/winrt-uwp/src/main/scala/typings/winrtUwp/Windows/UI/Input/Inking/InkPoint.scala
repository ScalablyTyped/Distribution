package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InkPoint extends js.Object {
  /** The X, Y coordinates of the InkPoint , in device-independent pixels (DIPs) relative to the upper left-hand corner of the inking area. */
  var position: Point
  var pressure: js.Any
}

object InkPoint {
  @scala.inline
  def apply(position: Point, pressure: js.Any): InkPoint = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkPoint]
  }
}

