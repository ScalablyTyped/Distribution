package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Radius extends js.Object {
  var radius: scala.Double
  var segments: scala.Double
  var thetaLength: scala.Double
  var thetaStart: scala.Double
}

object Anon_Radius {
  @scala.inline
  def apply(radius: scala.Double, segments: scala.Double, thetaLength: scala.Double, thetaStart: scala.Double): Anon_Radius = {
    val __obj = js.Dynamic.literal(radius = radius, segments = segments, thetaLength = thetaLength, thetaStart = thetaStart)
  
    __obj.asInstanceOf[Anon_Radius]
  }
}

