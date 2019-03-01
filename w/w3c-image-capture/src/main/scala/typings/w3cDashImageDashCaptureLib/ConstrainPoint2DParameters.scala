package typings
package w3cDashImageDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstrainPoint2DParameters extends js.Object {
  var exact: js.Array[Point2D]
  var ideal: js.Array[Point2D]
}

object ConstrainPoint2DParameters {
  @scala.inline
  def apply(exact: js.Array[Point2D], ideal: js.Array[Point2D]): ConstrainPoint2DParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exact")(exact)
    __obj.updateDynamic("ideal")(ideal)
    __obj.asInstanceOf[ConstrainPoint2DParameters]
  }
}

