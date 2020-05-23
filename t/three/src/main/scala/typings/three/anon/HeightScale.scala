package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightScale extends js.Object {
  var heightScale: Double
  var p: Double
  var q: Double
  var radialSegments: Double
  var radius: Double
  var tube: Double
  var tubularSegments: Double
}

object HeightScale {
  @scala.inline
  def apply(
    heightScale: Double,
    p: Double,
    q: Double,
    radialSegments: Double,
    radius: Double,
    tube: Double,
    tubularSegments: Double
  ): HeightScale = {
    val __obj = js.Dynamic.literal(heightScale = heightScale.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], radialSegments = radialSegments.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tube = tube.asInstanceOf[js.Any], tubularSegments = tubularSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightScale]
  }
}

