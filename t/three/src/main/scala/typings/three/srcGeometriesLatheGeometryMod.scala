package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreGeometryMod.Geometry
import typings.three.srcMathVector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/LatheGeometry", JSImport.Namespace)
@js.native
object srcGeometriesLatheGeometryMod extends js.Object {
  @js.native
  class LatheBufferGeometry protected () extends BufferGeometry {
    def this(points: js.Array[Vector2]) = this()
    def this(points: js.Array[Vector2], segments: Double) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double, phiLength: Double) = this()
    var parameters: Anon_PhiLength = js.native
  }
  
  @js.native
  class LatheGeometry protected () extends Geometry {
    def this(points: js.Array[Vector2]) = this()
    def this(points: js.Array[Vector2], segments: Double) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double, phiLength: Double) = this()
    var parameters: Anon_PhiLength = js.native
  }
  
}

