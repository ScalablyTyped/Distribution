package typings.winrt

import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OutPoint extends js.Object {
  var outPoint: Point
  var returnValue: Boolean
}

object Anon_OutPoint {
  @scala.inline
  def apply(outPoint: Point, returnValue: Boolean): Anon_OutPoint = {
    val __obj = js.Dynamic.literal(outPoint = outPoint, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_OutPoint]
  }
}

