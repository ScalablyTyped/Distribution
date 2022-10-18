package typings.three

import typings.three.srcThreeMod.Curve
import typings.three.srcThreeMod.Vector2
import typings.three.srcThreeMod.Vector3
import typings.three.srcThreeMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmCurvesNurbscurveMod {
  
  @JSImport("three/examples/jsm/curves/NURBSCurve", "NURBSCurve")
  @js.native
  open class NURBSCurve protected () extends Curve[Vector3] {
    def this(
      degree: Double,
      knots: js.Array[Double],
      controlPoints: js.Array[Vector2 | Vector3 | Vector4],
      startKnot: Double,
      endKnot: Double
    ) = this()
  }
}
