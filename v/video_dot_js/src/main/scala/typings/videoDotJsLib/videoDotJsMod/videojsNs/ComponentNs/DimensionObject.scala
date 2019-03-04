package typings
package videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that contains width and height values of the `Component`s
		 * computed style. Uses `window.getComputedStyle`.
		 */
trait DimensionObject extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object DimensionObject {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): DimensionObject = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[DimensionObject]
  }
}

