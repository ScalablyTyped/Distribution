package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/curves/LineCurve", JSImport.Namespace)
@js.native
object srcExtrasCurvesLineCurveMod extends js.Object {
  @js.native
  class LineCurve protected () extends Curve[Vector2] {
    def this(v1: Vector2, v2: Vector2) = this()
    var v1: Vector2 = js.native
    var v2: Vector2 = js.native
  }
  
}

