package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightScale extends js.Object {
  var heightScale: Double
  var p: Double
  var q: Double
  var radialSegments: Double
  var radius: Double
  var tube: Double
  var tubularSegments: Double
}

object Anon_HeightScale {
  @scala.inline
  def apply(
    heightScale: Double,
    p: Double,
    q: Double,
    radialSegments: Double,
    radius: Double,
    tube: Double,
    tubularSegments: Double
  ): Anon_HeightScale = {
    val __obj = js.Dynamic.literal(heightScale = heightScale, p = p, q = q, radialSegments = radialSegments, radius = radius, tube = tube, tubularSegments = tubularSegments)
  
    __obj.asInstanceOf[Anon_HeightScale]
  }
}

