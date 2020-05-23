package typings.winrt.anon

import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutPoint extends js.Object {
  var outPoint: Point
  var returnValue: Boolean
}

object OutPoint {
  @scala.inline
  def apply(outPoint: Point, returnValue: Boolean): OutPoint = {
    val __obj = js.Dynamic.literal(outPoint = outPoint.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutPoint]
  }
}

