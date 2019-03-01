package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arc extends js.Object {
  var arc: scala.Double
  var radialSegments: scala.Double
  var radius: scala.Double
  var tube: scala.Double
  var tubularSegments: scala.Double
}

object Anon_Arc {
  @scala.inline
  def apply(
    arc: scala.Double,
    radialSegments: scala.Double,
    radius: scala.Double,
    tube: scala.Double,
    tubularSegments: scala.Double
  ): Anon_Arc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arc")(arc)
    __obj.updateDynamic("radialSegments")(radialSegments)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("tube")(tube)
    __obj.updateDynamic("tubularSegments")(tubularSegments)
    __obj.asInstanceOf[Anon_Arc]
  }
}

