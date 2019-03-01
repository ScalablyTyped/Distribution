package typings
package videoDotJsLib.videoDotJsMod.videojsNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The postion of a DOM element on the page.
		 */
trait Position extends js.Object {
  /**
  			 * Pixels to the left
  			 */
  var left: scala.Double
  /**
  			 * Pixels on top
  			 */
  var top: scala.Double
}

object Position {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): Position = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Position]
  }
}

