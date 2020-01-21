package typings.three

import typings.three.ellipseCurveMod.EllipseCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/curves/ArcCurve", JSImport.Namespace)
@js.native
object arcCurveMod extends js.Object {
  @js.native
  class ArcCurve protected () extends EllipseCurve {
    def this(
      aX: Double,
      aY: Double,
      aRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean
    ) = this()
  }
  
}

