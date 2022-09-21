package typings.three

import typings.three.threeMod.Vector2
import typings.three.threeMod.Vector3
import typings.three.threeMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nurbssurfaceMod {
  
  @JSImport("three/examples/jsm/curves/NURBSSurface", "NURBSSurface")
  @js.native
  open class NURBSSurface protected () extends StObject {
    def this(
      degree1: Double,
      degree2: Double,
      knots1: js.Array[Double],
      knots2: js.Array[Double],
      controlPoints: js.Array[js.Array[Vector2 | Vector3 | Vector4]]
    ) = this()
    
    def getPoint(t1: Double, t2: Double, target: Vector3): Unit = js.native
  }
}
