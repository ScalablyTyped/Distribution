package typings.three

import typings.three.curveMod.Curve
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/curves/SplineCurve", JSImport.Namespace)
@js.native
object splineCurveMod extends js.Object {
  @js.native
  class SplineCurve () extends Curve[Vector2] {
    def this(points: js.Array[Vector2]) = this()
    var points: js.Array[Vector2] = js.native
  }
  
}

