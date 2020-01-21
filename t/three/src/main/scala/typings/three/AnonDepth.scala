package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDepth extends js.Object {
  var depth: Double
  var depthSegments: Double
  var height: Double
  var heightSegments: Double
  var width: Double
  var widthSegments: Double
}

object AnonDepth {
  @scala.inline
  def apply(
    depth: Double,
    depthSegments: Double,
    height: Double,
    heightSegments: Double,
    width: Double,
    widthSegments: Double
  ): AnonDepth = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], depthSegments = depthSegments.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightSegments = heightSegments.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthSegments = widthSegments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDepth]
  }
}

