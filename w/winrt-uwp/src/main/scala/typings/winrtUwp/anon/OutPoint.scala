package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutPoint extends js.Object {
  /** The transformed input point. */ var outPoint: Point
  /** True if inPoint was transformed successfully; otherwise, false. */ var returnValue: Boolean
}

object OutPoint {
  @scala.inline
  def apply(outPoint: Point, returnValue: Boolean): OutPoint = {
    val __obj = js.Dynamic.literal(outPoint = outPoint.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutPoint]
  }
}

