package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InnerRadius extends js.Object {
  var innerRadius: Double
  var outerRadius: Double
  var phiSegments: Double
  var thetaLength: Double
  var thetaSegments: Double
  var thetaStart: Double
}

object Anon_InnerRadius {
  @scala.inline
  def apply(
    innerRadius: Double,
    outerRadius: Double,
    phiSegments: Double,
    thetaLength: Double,
    thetaSegments: Double,
    thetaStart: Double
  ): Anon_InnerRadius = {
    val __obj = js.Dynamic.literal(innerRadius = innerRadius, outerRadius = outerRadius, phiSegments = phiSegments, thetaLength = thetaLength, thetaSegments = thetaSegments, thetaStart = thetaStart)
  
    __obj.asInstanceOf[Anon_InnerRadius]
  }
}

