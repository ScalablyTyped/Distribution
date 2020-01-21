package typings.three

import typings.three.curveMod.Curve
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/curves/QuadraticBezierCurve", JSImport.Namespace)
@js.native
object quadraticBezierCurveMod extends js.Object {
  @js.native
  class QuadraticBezierCurve protected () extends Curve[Vector2] {
    def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()
    var v0: Vector2 = js.native
    var v1: Vector2 = js.native
    var v2: Vector2 = js.native
  }
  
}

