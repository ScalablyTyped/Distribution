package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.matrix4Mod.Matrix4
import typings.three.meshMod.Mesh
import typings.three.skeletonMod.Skeleton
import typings.three.threeBooleans.`true`
import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skinnedMeshMod {
  
  @JSImport("three/src/objects/SkinnedMesh", "SkinnedMesh")
  @js.native
  open class SkinnedMesh[TGeometry /* <: BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] () extends Mesh[TGeometry, TMaterial] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: Unit, material: TMaterial) = this()
    def this(geometry: TGeometry, material: TMaterial, useVertexTexture: Boolean) = this()
    def this(geometry: TGeometry, material: Unit, useVertexTexture: Boolean) = this()
    def this(geometry: Unit, material: TMaterial, useVertexTexture: Boolean) = this()
    def this(geometry: Unit, material: Unit, useVertexTexture: Boolean) = this()
    
    def bind(skeleton: Skeleton): Unit = js.native
    def bind(skeleton: Skeleton, bindMatrix: Matrix4): Unit = js.native
    
    var bindMatrix: Matrix4 = js.native
    
    var bindMatrixInverse: Matrix4 = js.native
    
    var bindMode: String = js.native
    
    def boneTransform(index: Double, target: Vector3): Vector3 = js.native
    
    val isSkinnedMesh: `true` = js.native
    
    def normalizeSkinWeights(): Unit = js.native
    
    def pose(): Unit = js.native
    
    var skeleton: Skeleton = js.native
  }
}
