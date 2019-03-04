package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRectangle extends js.Object {
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
  def contains(point: IPoint): scala.Boolean
}

object IRectangle {
  @scala.inline
  def apply(
    contains: js.Function1[IPoint, scala.Boolean],
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): IRectangle = {
    val __obj = js.Dynamic.literal(contains = contains, height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[IRectangle]
  }
}

