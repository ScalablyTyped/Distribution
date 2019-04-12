package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PhiLength extends js.Object {
  var phiLength: scala.Double
  var phiStart: scala.Double
  var points: js.Array[threeLib.srcMathVector2Mod.Vector2]
  var segments: scala.Double
}

object Anon_PhiLength {
  @scala.inline
  def apply(
    phiLength: scala.Double,
    phiStart: scala.Double,
    points: js.Array[threeLib.srcMathVector2Mod.Vector2],
    segments: scala.Double
  ): Anon_PhiLength = {
    val __obj = js.Dynamic.literal(phiLength = phiLength, phiStart = phiStart, points = points, segments = segments)
  
    __obj.asInstanceOf[Anon_PhiLength]
  }
}

