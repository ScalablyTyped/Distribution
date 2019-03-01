package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightScale extends js.Object {
  var heightScale: scala.Double
  var p: scala.Double
  var q: scala.Double
  var radialSegments: scala.Double
  var radius: scala.Double
  var tube: scala.Double
  var tubularSegments: scala.Double
}

object Anon_HeightScale {
  @scala.inline
  def apply(
    heightScale: scala.Double,
    p: scala.Double,
    q: scala.Double,
    radialSegments: scala.Double,
    radius: scala.Double,
    tube: scala.Double,
    tubularSegments: scala.Double
  ): Anon_HeightScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("heightScale")(heightScale)
    __obj.updateDynamic("p")(p)
    __obj.updateDynamic("q")(q)
    __obj.updateDynamic("radialSegments")(radialSegments)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("tube")(tube)
    __obj.updateDynamic("tubularSegments")(tubularSegments)
    __obj.asInstanceOf[Anon_HeightScale]
  }
}

