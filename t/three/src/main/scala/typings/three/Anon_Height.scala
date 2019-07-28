package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: Double
  var heightSegments: Double
  var openEnded: Boolean
  var radialSegments: Double
  var radiusBottom: Double
  var radiusTop: Double
  var thetaLength: Double
  var thetaStart: Double
}

object Anon_Height {
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
  ): Anon_Height = {
    val __obj = js.Dynamic.literal(height = height, heightSegments = heightSegments, openEnded = openEnded, radialSegments = radialSegments, radiusBottom = radiusBottom, radiusTop = radiusTop, thetaLength = thetaLength, thetaStart = thetaStart)
  
    __obj.asInstanceOf[Anon_Height]
  }
}

