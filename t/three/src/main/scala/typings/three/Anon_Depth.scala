package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Depth extends js.Object {
  var depth: Double
  var depthSegments: Double
  var height: Double
  var heightSegments: Double
  var width: Double
  var widthSegments: Double
}

object Anon_Depth {
  @scala.inline
  def apply(
    depth: Double,
    depthSegments: Double,
    height: Double,
    heightSegments: Double,
    width: Double,
    widthSegments: Double
  ): Anon_Depth = {
    val __obj = js.Dynamic.literal(depth = depth, depthSegments = depthSegments, height = height, heightSegments = heightSegments, width = width, widthSegments = widthSegments)
  
    __obj.asInstanceOf[Anon_Depth]
  }
}

