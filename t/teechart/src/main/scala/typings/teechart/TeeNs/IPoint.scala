package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPoint extends js.Object {
  var x: Double
  var y: Double
}

object IPoint {
  @scala.inline
  def apply(x: Double, y: Double): IPoint = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[IPoint]
  }
}

