package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Color
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMathMeshSurfaceSamplerMod {
  
  @JSImport("three/examples/jsm/math/MeshSurfaceSampler", "MeshSurfaceSampler")
  @js.native
  open class MeshSurfaceSampler protected () extends StObject {
    def this(mesh: Mesh[BufferGeometry, Material | js.Array[Material]]) = this()
    
    def binarySearch(x: Double): Double = js.native
    
    def build(): this.type = js.native
    
    var distribution: js.typedarray.Float32Array | Null = js.native
    
    var geometry: typings.three.srcThreeMod.BufferGeometry = js.native
    
    var positionAttribute: js.typedarray.Float32Array = js.native
    
    def sample(targetPosition: Vector3): this.type = js.native
    def sample(targetPosition: Vector3, targetNormal: Unit, targetColor: Color): this.type = js.native
    def sample(targetPosition: Vector3, targetNormal: Vector3): this.type = js.native
    def sample(targetPosition: Vector3, targetNormal: Vector3, targetColor: Color): this.type = js.native
    
    def sampleFace(faceIndex: Double, targetPosition: Vector3): this.type = js.native
    def sampleFace(faceIndex: Double, targetPosition: Vector3, targetNormal: Unit, targetColor: Color): this.type = js.native
    def sampleFace(faceIndex: Double, targetPosition: Vector3, targetNormal: Vector3): this.type = js.native
    def sampleFace(faceIndex: Double, targetPosition: Vector3, targetNormal: Vector3, targetColor: Color): this.type = js.native
    
    def setWeightAttribute(): this.type = js.native
    def setWeightAttribute(name: String): this.type = js.native
    
    var weightAttribute: String | Null = js.native
  }
}
