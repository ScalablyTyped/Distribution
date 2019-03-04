package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBox extends js.Object {
  var bottom: scala.Double
  var left: scala.Double
  var right: scala.Double
  var top: scala.Double
}

object BoundingBox {
  @scala.inline
  def apply(bottom: scala.Double, left: scala.Double, right: scala.Double, top: scala.Double): BoundingBox = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[BoundingBox]
  }
}

