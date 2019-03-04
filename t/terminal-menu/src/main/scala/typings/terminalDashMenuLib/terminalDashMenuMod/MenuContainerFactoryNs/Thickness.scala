package typings
package terminalDashMenuLib.terminalDashMenuMod.MenuContainerFactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thickness extends js.Object {
  /**
    * Represents width of the lower side of the bounding rectangle.
    */
  var bottom: scala.Double
  /**
    * Represents width of the left side of the bounding rectangle.
    */
  var left: scala.Double
  /**
    * Represents width of the right side of the bounding rectangle.
    */
  var right: scala.Double
  /**
    * Represents width of the upper side of the bounding rectangle.
    */
  var top: scala.Double
}

object Thickness {
  @scala.inline
  def apply(bottom: scala.Double, left: scala.Double, right: scala.Double, top: scala.Double): Thickness = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[Thickness]
  }
}

