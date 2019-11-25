package typings.videoDotJs.videoDotJsMod.videojs.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that contains width and height values of the `Component`s
  * computed style. Uses `window.getComputedStyle`.
  */
trait DimensionObject extends js.Object {
  var height: Double
  var width: Double
}

object DimensionObject {
  @scala.inline
  def apply(height: Double, width: Double): DimensionObject = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DimensionObject]
  }
}

