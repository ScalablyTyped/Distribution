package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPhiStart extends js.Object {
  var heightSegments: Double
  var phiLength: Double
  var phiStart: Double
  var radius: Double
  var thetaLength: Double
  var thetaStart: Double
  var widthSegments: Double
}

object AnonPhiStart {
  @scala.inline
  def apply(
    heightSegments: Double,
    phiLength: Double,
    phiStart: Double,
    radius: Double,
    thetaLength: Double,
    thetaStart: Double,
    widthSegments: Double
  ): AnonPhiStart = {
    val __obj = js.Dynamic.literal(heightSegments = heightSegments.asInstanceOf[js.Any], phiLength = phiLength.asInstanceOf[js.Any], phiStart = phiStart.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any], widthSegments = widthSegments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPhiStart]
  }
}

