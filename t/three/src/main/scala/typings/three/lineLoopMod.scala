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
  class LineLoop () extends Line {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
    def this(geometry: BufferGeometry, material: Material) = this()
    def this(geometry: Geometry, material: js.Array[Material]) = this()
    def this(geometry: Geometry, material: Material) = this()
    val isLineLoop: `true` = js.native
    @JSName("type")
    var type_LineLoop: typings.three.threeStrings.LineLoop = js.native
  }
  
}

