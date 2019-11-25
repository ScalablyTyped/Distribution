package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Closed extends js.Object {
  var closed: Boolean
  var path: Curve[Vector3]
  var radialSegments: Double
  var radius: Double
  var tubularSegments: Double
}

object Anon_Closed {
  @scala.inline
  def apply(
    closed: Boolean,
    path: Curve[Vector3],
    radialSegments: Double,
    radius: Double,
    tubularSegments: Double
  ): Anon_Closed = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], radialSegments = radialSegments.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tubularSegments = tubularSegments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Closed]
  }
}

