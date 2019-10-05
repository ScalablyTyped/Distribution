package typings.videoDotJs.videoDotJsMod.videojs.Dom

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
  var x: Double
  /**
  			 * y coordinate in pixels
  			 */
  var y: Double
}

object Coordinates {
  @scala.inline
  def apply(x: Double, y: Double): Coordinates = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Coordinates]
  }
}

