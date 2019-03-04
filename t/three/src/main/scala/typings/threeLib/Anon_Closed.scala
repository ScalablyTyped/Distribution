package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Closed extends js.Object {
  var closed: scala.Boolean
  var path: threeLib.threeDashCoreMod.Curve[threeLib.threeDashCoreMod.Vector3]
  var radialSegments: scala.Double
  var radius: scala.Double
  var tubularSegments: scala.Double
}

object Anon_Closed {
  @scala.inline
  def apply(
    closed: scala.Boolean,
    path: threeLib.threeDashCoreMod.Curve[threeLib.threeDashCoreMod.Vector3],
    radialSegments: scala.Double,
    radius: scala.Double,
    tubularSegments: scala.Double
  ): Anon_Closed = {
    val __obj = js.Dynamic.literal(closed = closed, path = path, radialSegments = radialSegments, radius = radius, tubularSegments = tubularSegments)
  
    __obj.asInstanceOf[Anon_Closed]
  }
}

