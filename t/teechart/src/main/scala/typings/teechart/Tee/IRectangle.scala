package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRectangle extends js.Object {
  var height: Double
  var width: Double
  var x: Double
  var y: Double
  def contains(point: IPoint): Boolean
}

object IRectangle {
  @scala.inline
  def apply(contains: IPoint => Boolean, height: Double, width: Double, x: Double, y: Double): IRectangle = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[IRectangle]
  }
}

