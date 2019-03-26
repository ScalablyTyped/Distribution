package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Widget's bounds
  */
trait Bounds extends js.Object {
  /**
    * the height of the widget in dip
    */
  var height: scala.Double
  /**
    * the horizontal offset from the parent's left edge in dip
    */
  var left: scala.Double
  /**
    * the vertical offset from the parent's top edge in dip
    */
  var top: scala.Double
  /**
    * the width of the widget in dip
    */
  var width: scala.Double
}

object Bounds {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double, width: scala.Double): Bounds = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[Bounds]
  }
}

