package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Radius extends js.Object {
  var radius: Double
  var segments: Double
  var thetaLength: Double
  var thetaStart: Double
}

object Anon_Radius {
  @scala.inline
  def apply(radius: Double, segments: Double, thetaLength: Double, thetaStart: Double): Anon_Radius = {
    val __obj = js.Dynamic.literal(radius = radius, segments = segments, thetaLength = thetaLength, thetaStart = thetaStart)
  
    __obj.asInstanceOf[Anon_Radius]
  }
}

