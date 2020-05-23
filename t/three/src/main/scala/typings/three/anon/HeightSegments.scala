package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightSegments extends js.Object {
  var height: Double
  var heightSegments: Double
  var openEnded: Boolean
  var radialSegments: Double
  var radiusBottom: Double
  var radiusTop: Double
  var thetaLength: Double
  var thetaStart: Double
}

object HeightSegments {
  @scala.inline
  def apply(
    height: Double,
    heightSegments: Double,
    openEnded: Boolean,
    radialSegments: Double,
    radiusBottom: Double,
    radiusTop: Double,
    thetaLength: Double,
    thetaStart: Double
  ): HeightSegments = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightSegments = heightSegments.asInstanceOf[js.Any], openEnded = openEnded.asInstanceOf[js.Any], radialSegments = radialSegments.asInstanceOf[js.Any], radiusBottom = radiusBottom.asInstanceOf[js.Any], radiusTop = radiusTop.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightSegments]
  }
}

