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
    val __obj = js.Dynamic.literal(heightSegments = heightSegments, phiLength = phiLength, phiStart = phiStart, radius = radius, thetaLength = thetaLength, thetaStart = thetaStart, widthSegments = widthSegments)
  
    __obj.asInstanceOf[Anon_HeightSegments]
  }
}

