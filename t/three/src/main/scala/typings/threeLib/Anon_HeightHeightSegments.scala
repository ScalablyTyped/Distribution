package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightHeightSegments extends js.Object {
  var height: scala.Double
  var heightSegments: scala.Double
  var openEnded: scala.Boolean
  var radialSegments: scala.Double
  var radiusBottom: scala.Double
  var radiusTop: scala.Double
  var thetaLength: scala.Double
  var thetaStart: scala.Double
}

object Anon_HeightHeightSegments {
  @scala.inline
  def apply(
    height: scala.Double,
    heightSegments: scala.Double,
    openEnded: scala.Boolean,
    radialSegments: scala.Double,
    radiusBottom: scala.Double,
    radiusTop: scala.Double,
    thetaLength: scala.Double,
    thetaStart: scala.Double
  ): Anon_HeightHeightSegments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("heightSegments")(heightSegments)
    __obj.updateDynamic("openEnded")(openEnded)
    __obj.updateDynamic("radialSegments")(radialSegments)
    __obj.updateDynamic("radiusBottom")(radiusBottom)
    __obj.updateDynamic("radiusTop")(radiusTop)
    __obj.updateDynamic("thetaLength")(thetaLength)
    __obj.updateDynamic("thetaStart")(thetaStart)
    __obj.asInstanceOf[Anon_HeightHeightSegments]
  }
}

