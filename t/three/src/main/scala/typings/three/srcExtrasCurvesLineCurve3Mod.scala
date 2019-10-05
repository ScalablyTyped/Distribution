package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/curves/LineCurve3", JSImport.Namespace)
@js.native
object srcExtrasCurvesLineCurve3Mod extends js.Object {
  @js.native
  class LineCurve3 protected () extends Curve[Vector3] {
    def this(v1: Vector3, v2: Vector3) = this()
    var v1: Vector3 = js.native
    var v2: Vector3 = js.native
  }
  
}

