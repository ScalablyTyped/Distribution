package typings.three

import typings.three.srcMathVector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PhiLength extends js.Object {
  var phiLength: Double
  var phiStart: Double
  var points: js.Array[Vector2]
  var segments: Double
}

object Anon_PhiLength {
  @scala.inline
  def apply(phiLength: Double, phiStart: Double, points: js.Array[Vector2], segments: Double): Anon_PhiLength = {
    val __obj = js.Dynamic.literal(phiLength = phiLength, phiStart = phiStart, points = points, segments = segments)
  
    __obj.asInstanceOf[Anon_PhiLength]
  }
}

