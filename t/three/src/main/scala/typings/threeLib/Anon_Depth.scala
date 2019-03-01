package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Depth extends js.Object {
  var depth: scala.Double
  var depthSegments: scala.Double
  var height: scala.Double
  var heightSegments: scala.Double
  var width: scala.Double
  var widthSegments: scala.Double
}

object Anon_Depth {
  @scala.inline
  def apply(
    depth: scala.Double,
    depthSegments: scala.Double,
    height: scala.Double,
    heightSegments: scala.Double,
    width: scala.Double,
    widthSegments: scala.Double
  ): Anon_Depth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("depthSegments")(depthSegments)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("heightSegments")(heightSegments)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("widthSegments")(widthSegments)
    __obj.asInstanceOf[Anon_Depth]
  }
}

