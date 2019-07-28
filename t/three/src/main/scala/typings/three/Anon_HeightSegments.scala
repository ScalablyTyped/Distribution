package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightSegments extends js.Object {
  var heightSegments: Double
  var phiLength: Double
  var phiStart: Double
  var radius: Double
  var thetaLength: Double
  var thetaStart: Double
  var widthSegments: Double
}

object Anon_HeightSegments {
  @scala.inline
  def apply(
    heightSegments: Double,
    phiLength: Double,
    phiStart: Double,
    radius: Double,
    thetaLength: Double,
    thetaStart: Double,
    widthSegments: Double
  ): Anon_HeightSegments = {
    val __obj = js.Dynamic.literal(heightSegments = heightSegments, phiLength = phiLength, phiStart = phiStart, radius = radius, thetaLength = thetaLength, thetaStart = thetaStart, widthSegments = widthSegments)
  
    __obj.asInstanceOf[Anon_HeightSegments]
  }
}

