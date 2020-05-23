package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionalLength extends js.Object {
  var directionalLength: Double
  var hemiLength: Double
  var numDirectionalShadows: Double
  var numPointShadows: Double
  var numSpotShadows: Double
  var pointLength: Double
  var rectAreaLength: Double
  var spotLength: Double
}

object DirectionalLength {
  @scala.inline
  def apply(
    directionalLength: Double,
    hemiLength: Double,
    numDirectionalShadows: Double,
    numPointShadows: Double,
    numSpotShadows: Double,
    pointLength: Double,
    rectAreaLength: Double,
    spotLength: Double
  ): DirectionalLength = {
    val __obj = js.Dynamic.literal(directionalLength = directionalLength.asInstanceOf[js.Any], hemiLength = hemiLength.asInstanceOf[js.Any], numDirectionalShadows = numDirectionalShadows.asInstanceOf[js.Any], numPointShadows = numPointShadows.asInstanceOf[js.Any], numSpotShadows = numSpotShadows.asInstanceOf[js.Any], pointLength = pointLength.asInstanceOf[js.Any], rectAreaLength = rectAreaLength.asInstanceOf[js.Any], spotLength = spotLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalLength]
  }
}

