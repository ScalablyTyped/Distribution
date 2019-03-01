package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightSegments extends js.Object {
  var heightSegments: scala.Double
  var phiLength: scala.Double
  var phiStart: scala.Double
  var radius: scala.Double
  var thetaLength: scala.Double
  var thetaStart: scala.Double
  var widthSegments: scala.Double
}

object Anon_HeightSegments {
  @scala.inline
  def apply(
    heightSegments: scala.Double,
    phiLength: scala.Double,
    phiStart: scala.Double,
    radius: scala.Double,
    thetaLength: scala.Double,
    thetaStart: scala.Double,
    widthSegments: scala.Double
  ): Anon_HeightSegments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("heightSegments")(heightSegments)
    __obj.updateDynamic("phiLength")(phiLength)
    __obj.updateDynamic("phiStart")(phiStart)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("thetaLength")(thetaLength)
    __obj.updateDynamic("thetaStart")(thetaStart)
    __obj.updateDynamic("widthSegments")(widthSegments)
    __obj.asInstanceOf[Anon_HeightSegments]
  }
}

