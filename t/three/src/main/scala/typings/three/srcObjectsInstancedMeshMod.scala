package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreInstancedBufferAttributeMod.InstancedBufferAttribute
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.Color
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcObjectsMeshMod.Mesh
import typings.three.srcThreeMod.Box3
import typings.three.srcThreeMod.Sphere
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsInstancedMeshMod {
  
  @JSImport("three/src/objects/InstancedMesh", "InstancedMesh")
  @js.native
  open class InstancedMesh[TGeometry /* <: BufferGeometry[NormalBufferAttributes] */, TMaterial /* <: Material | js.Array[Material] */] protected () extends Mesh[TGeometry, TMaterial] {
    /**
      * Create a new instance of {@link InstancedMesh}
      * @param geometry An instance of {@link THREE.BufferGeometry | BufferGeometry}.
      * @param material A single or an array of {@link THREE.Material | Material}. Default {@link THREE.MeshBasicMaterial | `new THREE.MeshBasicMaterial()`}.
      * @param count The **maximum** number of instances of this Mesh. Expects a `Integer`
      */
    def this(geometry: TGeometry, material: TMaterial, count: Double) = this()
    def this(geometry: TGeometry, material: Unit, count: Double) = this()
    def this(geometry: Unit, material: TMaterial, count: Double) = this()
    def this(geometry: Unit, material: Unit, count: Double) = this()
    
    /**
      * This bounding box encloses all instances of the {@link InstancedMesh},, which can be calculated with {@link computeBoundingBox | .computeBoundingBox()}.
      * @remarks Bounding boxes aren't computed by default. They need to be explicitly computed, otherwise they are `null`.
      * @defaultValue `null`
      */
    var boundingBox: Box3 | Null = js.native
    
    /**
      * This bounding sphere encloses all instances of the {@link InstancedMesh}, which can be calculated with {@link computeBoundingSphere | .computeBoundingSphere()}.
      * @remarks bounding spheres aren't computed by default. They need to be explicitly computed, otherwise they are `null`.
      * @defaultValue `null`
      */
    var boundingSphere: Sphere | Null = js.native
    
    /**
      * Computes bounding box of the all instances, updating {@link boundingBox | .boundingBox} attribute.
      * @remarks Bounding boxes aren't computed by default. They need to be explicitly computed, otherwise they are `null`.
      */
    def computeBoundingBox(): Unit = js.native
    
    /**
      * Computes bounding sphere of the all instances, updating {@link boundingSphere | .boundingSphere} attribute.
      * @remarks bounding spheres aren't computed by default. They need to be explicitly computed, otherwise they are `null`.
      */
    def computeBoundingSphere(): Unit = js.native
    
    /**
      * The number of instances.
      * @remarks
      * The `count` value passed into the {@link InstancedMesh | constructor} represents the **maximum** number of instances of this mesh.
      * You can change the number of instances at runtime to an integer value in the range `[0, count]`.
      * @remarks If you need more instances than the original `count` value, you have to create a new InstancedMesh.
      * @remarks Expects a `Integer`
      */
    var count: Double = js.native
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * Get the color of the defined instance.
      * @param index The index of an instance. Values have to be in the range `[0, count]`. Expects a `Integer`
      * @param color This color object will be set to the color of the defined instance.
      */
    def getColorAt(index: Double, color: Color): Unit = js.native
    
    /**
      * Get the local transformation matrix of the defined instance.
      * @param index The index of an instance Values have to be in the range `[0, count]`. Expects a `Integer`
      * @param matrix This 4x4 matrix will be set to the local transformation matrix of the defined instance.
      */
    def getMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
    
    /**
      * Represents the colors of all instances.
      * You have to set {@link InstancedBufferAttribute.needsUpdate | .instanceColor.needsUpdate()} flag to `true` if you modify instanced data via {@link setColorAt | .setColorAt()}.
      * @defaultValue `null`
      */
    var instanceColor: InstancedBufferAttribute | Null = js.native
    
    /**
      * Represents the local transformation of all instances.
      * You have to set {@link InstancedBufferAttribute.needsUpdate | .instanceMatrix.needsUpdate()} flag to `true` if you modify instanced data via {@link setMatrixAt | .setMatrixAt()}.
      */
    var instanceMatrix: InstancedBufferAttribute = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link InstancedMesh}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isInstancedMesh: `true` = js.native
    
    /**
      * Sets the given color to the defined instance
      * @remarks
      * Make sure you set {@link InstancedBufferAttribute.needsUpdate | .instanceColor.needsUpdate()} to `true` after updating all the colors.
      * @param index The index of an instance. Values have to be in the range `[0, count]`. Expects a `Integer`
      * @param color The color of a single instance.
      */
    def setColorAt(index: Double, color: Color): Unit = js.native
    
    /**
      * Sets the given local transformation matrix to the defined instance.
      * @remarks
      * Make sure you set {@link InstancedBufferAttribute.needsUpdate | .instanceMatrix.needsUpdate()} flag to `true` after updating all the matrices.
      * @param index The index of an instance. Values have to be in the range `[0, count]`. Expects a `Integer`
      * @param matrix A 4x4 matrix representing the local transformation of a single instance.
      */
    def setMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
  }
}
