package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathBox3Mod.Box3
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathSphereMod.Sphere
import typings.three.srcMathVector3Mod.Vector3
import typings.three.srcObjectsMeshMod.Mesh
import typings.three.srcObjectsSkeletonMod.Skeleton
import typings.three.threeBooleans.`true`
import typings.three.threeStrings.attached
import typings.three.threeStrings.detached
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsSkinnedMeshMod {
  
  @JSImport("three/src/objects/SkinnedMesh", "SkinnedMesh")
  @js.native
  /**
    * Create a new instance of {@link SkinnedMesh}
    * @param geometry An instance of {@link THREE.BufferGeometry | BufferGeometry}. Default {@link THREE.BufferGeometry | `new THREE.BufferGeometry()`}.
    * @param material A single or an array of {@link THREE.Material | Material}. Default {@link THREE.MeshBasicMaterial | `new THREE.MeshBasicMaterial()`}.
    */
  open class SkinnedMesh[TGeometry /* <: BufferGeometry[NormalBufferAttributes] */, TMaterial /* <: Material | js.Array[Material] */] () extends Mesh[TGeometry, TMaterial] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: Unit, material: TMaterial) = this()
    def this(geometry: TGeometry, material: TMaterial, useVertexTexture: Boolean) = this()
    def this(geometry: TGeometry, material: Unit, useVertexTexture: Boolean) = this()
    def this(geometry: Unit, material: TMaterial, useVertexTexture: Boolean) = this()
    def this(geometry: Unit, material: Unit, useVertexTexture: Boolean) = this()
    
    /**
      * Applies the bone transform associated with the given index to the given position vector
      * @remarks Returns the updated vector.
      * @param index Expects a `Integer`
      * @param vector
      */
    def applyBoneTransform(index: Double, vector: Vector3): Vector3 = js.native
    
    /**
      * Bind a skeleton to the skinned mesh
      * @remarks
      * The bindMatrix gets saved to .bindMatrix property and the .bindMatrixInverse gets calculated.
      * @param skeleton {@link THREE.Skeleton | Skeleton} created from a {@link Bone | Bones} tree.
      * @param bindMatrix {@link THREE.Matrix4 | Matrix4} that represents the base transform of the skeleton.
      */
    def bind(skeleton: Skeleton): Unit = js.native
    def bind(skeleton: Skeleton, bindMatrix: Matrix4): Unit = js.native
    
    /**
      * The base matrix that is used for the bound bone transforms.
      */
    var bindMatrix: Matrix4 = js.native
    
    /**
      * The base matrix that is used for resetting the bound bone transforms.
      */
    var bindMatrixInverse: Matrix4 = js.native
    
    /**
      * Either `attached` or `detached`.
      *  - `attached` uses the {@link THREE.SkinnedMesh.matrixWorld | SkinnedMesh.matrixWorld} property for the base transform matrix of the bones.
      *  - `detached` uses the {@link THREE.SkinnedMesh.bindMatrix | SkinnedMesh.bindMatrix}.
      * @defaultValue `attached`.
      */
    var bindMode: attached | detached = js.native
    
    /**
      * @deprecated {@link THREE.SkinnedMesh}: {@link boneTransform | .boneTransform()} was renamed to {@link applyBoneTransform | .applyBoneTransform()} in **r151**.
      */
    def boneTransform(index: Double, target: Vector3): Vector3 = js.native
    
    /**
      * The bounding box of the SkinnedMesh. Can be calculated with {@link computeBoundingBox | .computeBoundingBox()}.
      * @default `null`
      */
    var boundingBox: Box3 = js.native
    
    /**
      * The bounding box of the SkinnedMesh. Can be calculated with {@link computeBoundingSphere | .computeBoundingSphere()}.
      * @default `null`
      */
    var boundingSphere: Sphere = js.native
    
    /**
      * Computes the bounding box, updating {@link boundingBox | .boundingBox} attribute.
      * @remarks
      * Bounding boxes aren't computed by default. They need to be explicitly computed, otherwise they are `null`. If an
      * instance of SkinnedMesh is animated, this method should be called per frame to compute a correct bounding box.
      */
    def computeBoundingBox(): Unit = js.native
    
    /**
      * Computes the bounding sphere, updating {@link boundingSphere | .boundingSphere} attribute.
      * @remarks
      * Bounding spheres aren't computed by default. They need to be explicitly computed, otherwise they are `null`. If
      * an instance of SkinnedMesh is animated, this method should be called per frame to compute a correct bounding
      * sphere.
      */
    def computeBoundingSphere(): Unit = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link SkinnedMesh}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isSkinnedMesh: `true` = js.native
    
    /**
      * Normalizes the skin weights.
      */
    def normalizeSkinWeights(): Unit = js.native
    
    /**
      * This method sets the skinned mesh in the rest pose (resets the pose).
      */
    def pose(): Unit = js.native
    
    /**
      * {@link THREE.Skeleton | Skeleton} representing the bone hierarchy of the skinned mesh.
      */
    var skeleton: Skeleton = js.native
    
    /**
      * @override
      * @defaultValue `SkinnedMesh`
      */
    @JSName("type")
    val type_SkinnedMesh: String | typings.three.threeStrings.SkinnedMesh = js.native
  }
}
