package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  /**
    * the height of the widget in dip
    */
  var height: Double
  /**
    * the horizontal offset from the parent's left edge in dip
    */
  var left: Double
  /**
    * the vertical offset from the parent's top edge in dip
    */
  var top: Double
  /**
    * the width of the widget in dip
    */
  var width: Double
}

object Bounds {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): Bounds = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
}

