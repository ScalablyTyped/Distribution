package typings.three

import typings.three.anon.PhiLength
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/LatheGeometry", JSImport.Namespace)
@js.native
object latheGeometryMod extends js.Object {
  @js.native
  class LatheBufferGeometry protected () extends BufferGeometry {
    def this(points: js.Array[Vector2]) = this()
    def this(points: js.Array[Vector2], segments: Double) = this()
    def this(points: js.Array[Vector2], segments: js.UndefOr[scala.Nothing], phiStart: Double) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double) = this()
    def this(
      points: js.Array[Vector2],
      segments: js.UndefOr[scala.Nothing],
      phiStart: js.UndefOr[scala.Nothing],
      phiLength: Double
    ) = this()
    def this(
      points: js.Array[Vector2],
      segments: js.UndefOr[scala.Nothing],
      phiStart: Double,
      phiLength: Double
    ) = this()
    def this(
      points: js.Array[Vector2],
      segments: Double,
      phiStart: js.UndefOr[scala.Nothing],
      phiLength: Double
    ) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double, phiLength: Double) = this()
    var parameters: PhiLength = js.native
  }
  
  @js.native
  class LatheGeometry protected () extends Geometry {
    def this(points: js.Array[Vector2]) = this()
    def this(points: js.Array[Vector2], segments: Double) = this()
    def this(points: js.Array[Vector2], segments: js.UndefOr[scala.Nothing], phiStart: Double) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double) = this()
    def this(
      points: js.Array[Vector2],
      segments: js.UndefOr[scala.Nothing],
      phiStart: js.UndefOr[scala.Nothing],
      phiLength: Double
    ) = this()
    def this(
      points: js.Array[Vector2],
      segments: js.UndefOr[scala.Nothing],
      phiStart: Double,
      phiLength: Double
    ) = this()
    def this(
      points: js.Array[Vector2],
      segments: Double,
      phiStart: js.UndefOr[scala.Nothing],
      phiLength: Double
    ) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double, phiLength: Double) = this()
    var parameters: PhiLength = js.native
  }
  
}

