package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArc extends js.Object {
  var arc: Double
  var radialSegments: Double
  var radius: Double
  var tube: Double
  var tubularSegments: Double
}

object AnonArc {
  @scala.inline
  def apply(arc: Double, radialSegments: Double, radius: Double, tube: Double, tubularSegments: Double): AnonArc = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any], radialSegments = radialSegments.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tube = tube.asInstanceOf[js.Any], tubularSegments = tubularSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArc]
  }
}

