package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathVector3Mod.Vector3
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsMeshMod {
  
  @JSImport("three/src/objects/Mesh", "Mesh")
  @js.native
  /**
    * Create a new instance of {@link Mesh}
    * @param geometry An instance of {@link THREE.BufferGeometry | BufferGeometry}. Default {@link THREE.BufferGeometry | `new THREE.BufferGeometry()`}.
    * @param material A single or an array of {@link THREE.Material | Material}. Default {@link THREE.MeshBasicMaterial | `new THREE.MeshBasicMaterial()`}.
    */
  open class Mesh[TGeometry /* <: BufferGeometry[NormalBufferAttributes] */, TMaterial /* <: Material | js.Array[Material] */] () extends Object3D[Event] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: Unit, material: TMaterial) = this()
    
    /**
      * An instance of {@link THREE.BufferGeometry | BufferGeometry} (or derived classes), defining the object's structure.
      * @defaultValue {@link THREE.BufferGeometry | `new THREE.BufferGeometry()`}.
      */
    var geometry: TGeometry = js.native
    
    /**
      * Get the local-space position of the vertex at the given index,
      * taking into account the current animation state of both morph targets and skinning.
      * @param index Expects a `Integer`
      * @param target
      */
    def getVertexPosition(index: Double, target: Vector3): Vector3 = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link Mesh}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isMesh: `true` = js.native
    
    /**
      * An instance of material derived from the {@link THREE.Material | Material} base class or an array of materials, defining the object's appearance.
      * @defaultValue {@link THREE.MeshBasicMaterial | `new THREE.MeshBasicMaterial()`}.
      */
    var material: TMaterial = js.native
    
    /**
      * A dictionary of morphTargets based on the `morphTarget.name` property.
      * @defaultValue `undefined`, _but rebuilt by {@link updateMorphTargets | .updateMorphTargets()}._
      *
      */
    var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
    
    /**
      * An array of weights typically from `0-1` that specify how much of the morph is applied.
      * @defaultValue `undefined`, _but reset to a blank array by {@link updateMorphTargets | .updateMorphTargets()}._
      */
    var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * @override
      * @defaultValue `Mesh`
      */
    @JSName("type")
    val type_Mesh: String | typings.three.threeStrings.Mesh = js.native
    
    /**
      * Updates the morphTargets to have no influence on the object
      * @remarks Resets the {@link morphTargetInfluences} and {@link morphTargetDictionary} properties.
      */
    def updateMorphTargets(): Unit = js.native
  }
}
