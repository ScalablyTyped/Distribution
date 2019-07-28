package typings.videoDotJs.videoDotJsMod.videojsNs.DomNs

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
  var left: Double
  /**
  			 * Pixels on top
  			 */
  var top: Double
}

object Position {
  @scala.inline
  def apply(left: Double, top: Double): Position = {
    val __obj = js.Dynamic.literal(left = left, top = top)
  
    __obj.asInstanceOf[Position]
  }
}

