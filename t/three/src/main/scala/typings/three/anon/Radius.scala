package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Radius extends js.Object {
  var radius: Double
  var segments: Double
  var thetaLength: Double
  var thetaStart: Double
}

object Radius {
  @scala.inline
  def apply(radius: Double, segments: Double, thetaLength: Double, thetaStart: Double): Radius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
}

