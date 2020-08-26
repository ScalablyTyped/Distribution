package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.lineMod.Line
import typings.three.materialMod.Material
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/LineLoop", JSImport.Namespace)
@js.native
object lineLoopMod extends js.Object {
  @js.native
  class LineLoop[TGeometry /* <: Geometry | BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] ()
    extends Line[Geometry | BufferGeometry, Material | js.Array[Material]] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: TMaterial) = this()
    val isLineLoop: `true` = js.native
    @JSName("type")
    var type_LineLoop: typings.three.threeStrings.LineLoop = js.native
  }
  
}

