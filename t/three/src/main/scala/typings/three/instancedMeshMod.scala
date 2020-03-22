package typings.three

import typings.three.bufferAttributeMod.BufferAttribute
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.materialMod.Material
import typings.three.matrix4Mod.Matrix4
import typings.three.meshMod.Mesh
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/InstancedMesh", JSImport.Namespace)
@js.native
object instancedMeshMod extends js.Object {
  @js.native
  class InstancedMesh protected () extends Mesh {
    def this(geometry: BufferGeometry, material: js.Array[Material], count: Double) = this()
    def this(geometry: BufferGeometry, material: Material, count: Double) = this()
    def this(geometry: Geometry, material: js.Array[Material], count: Double) = this()
    def this(geometry: Geometry, material: Material, count: Double) = this()
    var count: Double = js.native
    var instanceMatrix: BufferAttribute = js.native
    val isInstancedMesh: `true` = js.native
    def getMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
    def setMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
  }
  
}

