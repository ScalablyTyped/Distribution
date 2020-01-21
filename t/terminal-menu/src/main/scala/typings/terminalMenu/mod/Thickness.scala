package typings.terminalMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thickness extends js.Object {
  /**
    * Represents width of the lower side of the bounding rectangle.
    */
  var bottom: Double
  /**
    * Represents width of the left side of the bounding rectangle.
    */
  var left: Double
  /**
    * Represents width of the right side of the bounding rectangle.
    */
  var right: Double
  /**
    * Represents width of the upper side of the bounding rectangle.
    */
  var top: Double
}

object Thickness {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Thickness = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Thickness]
  }
}

