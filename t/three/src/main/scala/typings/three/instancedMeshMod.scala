package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.colorMod.Color
import typings.three.instancedBufferAttributeMod.InstancedBufferAttribute
import typings.three.materialMod.Material
import typings.three.matrix4Mod.Matrix4
import typings.three.meshMod.Mesh
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instancedMeshMod {
  
  @JSImport("three/src/objects/InstancedMesh", "InstancedMesh")
  @js.native
  open class InstancedMesh[TGeometry /* <: BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] protected () extends Mesh[TGeometry, TMaterial] {
    def this(geometry: TGeometry, material: TMaterial, count: Double) = this()
    def this(geometry: TGeometry, material: Unit, count: Double) = this()
    def this(geometry: Unit, material: TMaterial, count: Double) = this()
    def this(geometry: Unit, material: Unit, count: Double) = this()
    
    var count: Double = js.native
    
    def dispose(): Unit = js.native
    
    def getColorAt(index: Double, color: Color): Unit = js.native
    
    def getMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
    
    var instanceColor: Null | InstancedBufferAttribute = js.native
    
    var instanceMatrix: InstancedBufferAttribute = js.native
    
    val isInstancedMesh: `true` = js.native
    
    def setColorAt(index: Double, color: Color): Unit = js.native
    
    def setMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
  }
}
