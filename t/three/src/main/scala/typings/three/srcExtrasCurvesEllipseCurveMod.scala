package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/curves/EllipseCurve", JSImport.Namespace)
@js.native
object srcExtrasCurvesEllipseCurveMod extends js.Object {
  @js.native
  class EllipseCurve protected () extends Curve[Vector2] {
    def this(
      aX: Double,
      aY: Double,
      xRadius: Double,
      yRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean,
      aRotation: Double
    ) = this()
    var aClockwise: Boolean = js.native
    var aEndAngle: Double = js.native
    var aRotation: Double = js.native
    var aStartAngle: Double = js.native
    var aX: Double = js.native
    var aY: Double = js.native
    var xRadius: Double = js.native
    var yRadius: Double = js.native
  }
  
}

