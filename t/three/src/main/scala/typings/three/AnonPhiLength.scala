package typings.three

import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPhiLength extends js.Object {
  var phiLength: Double
  var phiStart: Double
  var points: js.Array[Vector2]
  var segments: Double
}

object AnonPhiLength {
  @scala.inline
  def apply(phiLength: Double, phiStart: Double, points: js.Array[Vector2], segments: Double): AnonPhiLength = {
    val __obj = js.Dynamic.literal(phiLength = phiLength.asInstanceOf[js.Any], phiStart = phiStart.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPhiLength]
  }
}

