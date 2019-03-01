package typings
package videoDotJsLib.videoDotJsMod.videojsNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * x and y coordinates for a dom element or mouse pointer
		 */
trait Coordinates extends js.Object {
  /**
  			 * x coordinate in pixels
  			 */
  var x: scala.Double
  /**
  			 * y coordinate in pixels
  			 */
  var y: scala.Double
}

object Coordinates {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Coordinates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Coordinates]
  }
}

