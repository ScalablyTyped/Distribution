package typings.three.anon

import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhiLength extends js.Object {
  var phiLength: Double
  var phiStart: Double
  var points: js.Array[Vector2]
  var segments: Double
}

object PhiLength {
  @scala.inline
  def apply(phiLength: Double, phiStart: Double, points: js.Array[Vector2], segments: Double): PhiLength = {
    val __obj = js.Dynamic.literal(phiLength = phiLength.asInstanceOf[js.Any], phiStart = phiStart.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhiLength]
  }
}

