package typings.w3cImageCapture

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
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], ideal = ideal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConstrainPoint2DParameters]
  }
}

