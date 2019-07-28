package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arc extends js.Object {
  var arc: Double
  var radialSegments: Double
  var radius: Double
  var tube: Double
  var tubularSegments: Double
}

object Anon_Arc {
  @scala.inline
  def apply(arc: Double, radialSegments: Double, radius: Double, tube: Double, tubularSegments: Double): Anon_Arc = {
    val __obj = js.Dynamic.literal(arc = arc, radialSegments = radialSegments, radius = radius, tube = tube, tubularSegments = tubularSegments)
  
    __obj.asInstanceOf[Anon_Arc]
  }
}

