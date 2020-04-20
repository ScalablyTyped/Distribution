package typings.winrt

import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOutPoint extends js.Object {
  var outPoint: Point
  var returnValue: Boolean
}

object AnonOutPoint {
  @scala.inline
  def apply(outPoint: Point, returnValue: Boolean): AnonOutPoint = {
    val __obj = js.Dynamic.literal(outPoint = outPoint.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOutPoint]
  }
}

