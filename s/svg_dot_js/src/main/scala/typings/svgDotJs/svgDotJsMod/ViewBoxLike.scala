package typings.svgDotJs.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// container.js
trait ViewBoxLike extends _ViewBoxAlias {
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object ViewBoxLike {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): ViewBoxLike = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[ViewBoxLike]
  }
}

